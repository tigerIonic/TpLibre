package edu.osgi.client;

import edu.osgi.magasin.Magasin;

public interface Iclient {
	
	public void demanderProduit(String libelle_produit, int quantite);
	public void passerCommande(double prixPanier) throws Exception;

	public int getIdClient();
	public void setIdClient(int idClient);

	public void setNom(String nom);
	public void setPorte_monnaie(double porte_monnaie);

	public String getNom();
	public double getPorte_monnaie();

}
