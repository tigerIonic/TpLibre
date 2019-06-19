package edu.osgi.magasin;

<<<<<<<
import java.util.Collection;

import edu.osgi.stock.Produit;

public class Magasin implements Imagasin {
	protected Collection<Commande> commandes;

	

	@Override
	public double getPrixPanier(int idPanier) {
		double somme=0;
		for (Commande cmd:commandes){
			if (cmd.getPanier().getIdPanier()==idPanier){
				for (Produit pdt:cmd.getPanier().getColProduit()){
					somme=somme+pdt.getPrix();
				}
			}
			
		};
		return somme;
	}

	@Override
	public double envoisFacture() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean produitDisponible(int idP, int quant) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ajoutProduit(String libelle, int quantite) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
=======
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
>>>>>>>
}
