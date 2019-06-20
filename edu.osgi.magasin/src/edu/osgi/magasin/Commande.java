package edu.osgi.magasin;

import edu.osgi.api.Produit;


public class Commande {
	private int Id_Commande;
	private Panier panier;
	private int idClient;
	private boolean commandeReglee;

	public Commande(int id_Commande, int idClient) {
		Id_Commande = id_Commande;
		this.panier = new Panier();
		this.idClient = idClient;
		this.commandeReglee = false;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	
	public int getId_Commande() {
		return Id_Commande;
	}
	public void setId_Commande(int id_Commande) {
		Id_Commande = id_Commande;
	}
	
	
	
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	public void ajoutProduit(String libelle, int quantite) throws Exception {
		Produit p=Catalogue.getProduit(libelle);
		p.setQuantite(quantite);
		getPanier().AddProduit(p);
		
	}

	public void afficherCommande() {
		System.out.println("Commande passée : \n<===================>");
		this.panier.afficherPanier();
		System.out.println("<===================>");
	}
	public double getPrixCommande() {
		return this.panier.getPrixPanier();
	}
	public void reglerCommande() {
		this.commandeReglee = true;
	}
	
}
