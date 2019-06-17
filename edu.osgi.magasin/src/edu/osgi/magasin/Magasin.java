package edu.osgi.magasin;

public class Magasin implements Imagasin{
	protected Panier panier;


	@Override
	public void ajoutProduit(String libelle, int quantite) {
		
	}

	@Override
	public double getPrixPanier() {
		return 0;
	}

	@Override
	public double envoisFacture() {
		return 0;
	}

	@Override
	public boolean produitDisponible(int idP, int quant) {
		return false;
	}
}
