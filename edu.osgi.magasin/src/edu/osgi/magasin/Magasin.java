package edu.osgi.magasin;


import java.util.Collection;

import edu.osgi.client.Iclient;

public class Magasin implements Imagasin{
	protected Collection<Commande> commandes;


	protected Collection<Iclient> clients;
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

	@Override
	public void enregistrerClient(Iclient client) throws Exception {
		for (Iclient cli:clients){
			if (cli == client) {
				throw new Exception("Impossible d'enregistrer ce client : Client déjà exitant.");
			} else if (cli.getIdClient() == client.getIdClient()) {
				throw new Exception("Impossible d'enregistrer ce client : Id client déjà utilisé.");
			}
		}
		this.clients.add(client);
		this.commandes.add(new Commande(this.commandes.size(), client.getIdClient()));
	}

	@Override
	public boolean produitDisponible(int idP, int quant) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Commande getCommande(int id) throws Exception{
		for (Commande com:commandes){
			if (com.getId_Commande()==id){
				return com;
			}
		}
		throw new Exception("commande non trouvée");

	}
	@Override
	public Commande getCommandeByClient(int idClient) throws Exception{
		for (Commande com:commandes){
			if (com.getIdClient()==idClient){
				return com;
			}
		}
		throw new Exception("Pas de commande trouvée pour ce client");

	}

	@Override
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

	@Override
	public Imagasin getCommande() {
		// TODO
		return null;
	}

	@Override
	public Collection<Commande> getCommandes() {
		return commandes;
	}

	@Override
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public Collection<Iclient> getClients() {
		return clients;
	}

	@Override
	public Iclient getClient(int idClient) throws Exception {
		Iclient res = null;
		for (Iclient cli:clients) {
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

	@Override
	public void setClients(Collection<Iclient> clients) {
		this.clients = clients;
	}

	@Override
	public Catalogue getCatalogue() {
		return catalogue;
	}

	@Override
	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}

	@Override
	public void ajoutProduit(String libelle_produit, int quantite) {

	}

}
