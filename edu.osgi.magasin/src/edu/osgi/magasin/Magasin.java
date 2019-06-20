package edu.osgi.magasin;


import java.util.Collection;

import edu.osgi.api.Produit;
import edu.osgi.client.Client;

public class Magasin {
	protected Collection<Commande> commandes;


	protected Collection<Client> clients;
	protected Catalogue catalogue;

	/** Constructeur privé */
	private Magasin()
	{System.out.println("magasin cr��");}

	/** Instance unique pré-initialisée */
	private static Magasin INSTANCE = new Magasin();

	/** Point d'accès pour l'instance unique du singleton */
	public static Magasin getInstance()
	{   return INSTANCE;
	}
	public void enregistrerClient(Client client) throws Exception {
		for (Client cli:clients){
			if (cli == client) {
				throw new Exception("Impossible d'enregistrer ce client : Client déjà exitant.");
			} else if (cli.getIdClient() == client.getIdClient()) {
				throw new Exception("Impossible d'enregistrer ce client : Id client déjà utilisé.");
			}
		}
		this.clients.add(client);
		this.commandes.add(new Commande(this.commandes.size(), client.getIdClient()));
	}

	
	public boolean produitDisponible(int idP, int quant) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	public Commande getCommande(int id) throws Exception{
		for (Commande com:commandes){
			if (com.getId_Commande()==id){
				return com;
			}
		}
		throw new Exception("commande non trouvée");
		
	}

	public void realiserTransaction(int idClient) throws Exception {
		for (Commande com:commandes){
			if (com.getIdClient()==idClient){
				this.getClient(idClient).payerTransaction(com.getPrixCommande());
				com.afficherCommande();
				com.reglerCommande();
			}
		}
		throw new Exception("Pas de commande associée à ce client");
	}

	
	public Imagasin getCommande() {
		// TODO
		return null;
	}


	public Collection<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	public Collection<Client> getClients() {
		return clients;
	}
	public Client getClient(int idClient) throws Exception {
		Client res = null;
		for (Client cli:clients) {
			if(cli.getIdClient() == idClient) {
				res = cli;
			}
		}
		if (res == null) {
			throw new Exception("Impossible de trouver ce client : pas de client avec cet id" + idClient);
		} else {
			return res;
		}
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public Catalogue getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}

}
