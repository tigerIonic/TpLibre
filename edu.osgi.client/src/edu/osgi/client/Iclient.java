package edu.osgi.client;

import edu.osgi.magasin.Magasin;

public interface Iclient {
	
	public void demanderProduit(String libelle_produit, int quantite);
	public void payerTransaction(double prixPanier) throws Exception;

	int getIdCommande();

	void setIdCommande(int idCommande);

	public int getIdClient();
	public void setIdClient(int idClient);

	public void setNom(String nom);
	public void setPorte_monnaie(double porte_monnaie);

	public String getNom();
	public double getPorte_monnaie();

}
