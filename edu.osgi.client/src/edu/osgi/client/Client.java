package edu.osgi.client;
import edu.osgi.magasin.Magasin;

public class Client implements Iclient {
	private int idClient;
	public int idCommande;

	
	private String nom;
	private double porte_monnaie;
	

	
	public Client(int id, String nom, double porte_monnaie){
		this.idClient=id;
		this.nom=nom;
		this.porte_monnaie = porte_monnaie;
	}

	@Override
	public int getIdCommande() {
		return idCommande;
	}

	@Override
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	

	@Override
	public int getIdClient() {
		return this.idClient;
	}

	@Override
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	@Override
	public void setNom(String nom) {
		this.nom= nom;
	}

	@Override
	public void setPorte_monnaie(double porte_monnaie) {
		this.porte_monnaie = porte_monnaie;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public double getPorte_monnaie() {
		return this.porte_monnaie;
	}

	@Override
	public void payerTransaction(double prixPanier) throws Exception {
		if(this.getPorte_monnaie() <= prixPanier){
			new ClientException("Porte monnaie inférieur au prix du panier");
		}
		this.setPorte_monnaie(this.getPorte_monnaie() - prixPanier);
	}

	@Override
		
	public void demanderProduit(String libelle_produit, int quantite){
		Magasin.getInstance().getCommande().ajoutProduit(libelle_produit, quantite);
	}
}
