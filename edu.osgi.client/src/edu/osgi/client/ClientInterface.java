package edu.osgi.client;
import edu.osgi.magasin.Magasin;

public interface ClientInterface {
	
	public void demanderProduit(String libelle_produit, int quantite);
	public void enregistrerMagasin(Magasin magasin);
	public boolean magasinEnregistrer();
	public void passerCommande(double prixPanier) throws Exception;

	public int getIdClient();
	public void setIdClient(int idClient);

	public void setNom(String nom);
	public void setPorte_monnaie(double porte_monnaie);

	public void setMagasin(Magasin magasin);
	public String getNom();

	public double getPorte_monnaie();
	public Magasin getMagasin();

}
