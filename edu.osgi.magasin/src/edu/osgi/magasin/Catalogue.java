package edu.osgi.magasin;

import java.util.ArrayList;
import java.util.Collection;

import edu.osgi.api.Produit;

public class Catalogue{
	public static Collection<Produit> listeProduit;
	
	public Catalogue(){
		
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
		throw new Exception("produit non trouvé");
	}
	
}
