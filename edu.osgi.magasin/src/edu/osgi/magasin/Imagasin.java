package edu.osgi.magasin;

public interface Imagasin {
	public void ajoutProduit(String libelle,int quantite);
	public double getPrixPanier();
	public double envoisFacture();
	public boolean produitDisponible(int idP,int quant);
	//public void retireStock(int idP,int quant);
	
}
