package edu.osgi.magasin;

import edu.osgi.api.Produit;


public class Commande {
	private int Id_Commande;
	private Panier panier;
	
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
	
	public void ajoutProduit(String libelle, int quantite) {
		Produit p=Catalogue.getProduit(libelle);
		p.setQuantite(quantite);
		getPanier().AddProduit(p);
		
	}
	
	
}
