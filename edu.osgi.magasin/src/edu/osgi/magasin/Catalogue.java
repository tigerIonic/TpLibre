package edu.osgi.magasin;

import java.util.ArrayList;
import java.util.Collection;

import edu.osgi.api.Produit;
import edu.osgi.stock.Stock;

public class Catalogue{
	public static Collection<Produit> listeProduit;
	
	/** Constructeur privé */
	private Catalogue()
	{
		this.listeProduit=Stock.getStock();
		for (Produit pro:listeProduit){
			pro.setQuantite(0);
		}
		System.out.println("catalogue cr��");
	}

	/** Instance unique pré-initialisée */
	private static Catalogue INSTANCE = new Catalogue();

	/** Point d'accès pour l'instance unique du singleton */
	public static Catalogue getInstance()
	{   return INSTANCE;
	}
	
	public Catalogue(Collection<Produit> liste){
		this.listeProduit=liste;
	}
	
	public static Produit getProduit(String libelle) throws Exception{
		
		for (Produit p:listeProduit){
			if (p.getLibelle().equals(libelle)){
				return p;
			}
		}
		throw new Exception("produit non trouv�");
	}
	
}
