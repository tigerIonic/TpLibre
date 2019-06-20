package edu.osgi.magasin;


import java.util.Collection;

import edu.osgi.api.Produit;

public class Magasin {
	protected Collection<Commande> commandes;
	protected Catalogue catalogue;

	/** Constructeur privé */
	private Magasin()
	{}

	/** Instance unique pré-initialisée */
	private static Magasin INSTANCE = new Magasin();

	/** Point d'accès pour l'instance unique du singleton */
	public static Magasin getInstance()
	{   return INSTANCE;
	}

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

	

	
	public boolean produitDisponible(int idP, int quant) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	public Commande getCommande(int id) throws Exception{
		for (Commande com:commandes){
			if (com.getId_Commande()==id){
				return com;
			}
		};
		throw new Exception("commande non trouv�e");
		
	}

	
	public Imagasin getCommande() {
		return null;
	}


}
