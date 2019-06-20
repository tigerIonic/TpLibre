package edu.osgi.stock;

import java.util.ArrayList;
import java.util.Collection;

import edu.osgi.api.ErreurProduit;
import edu.osgi.api.Produit;


public class Stock {
	private Collection<Produit> stock=new ArrayList<Produit>();
	
	/** Constructeur privÃ© */
	private Stock()
	{
		stock.add(new Produit(1,"carotte",1.5,100));
		stock.add(new Produit(2,"tomate",1.5,100));
		stock.add(new Produit(3,"saucisson",3,100));
		stock.add(new Produit(4,"navet",1,100));
		stock.add(new Produit(5,"boeuf",12,100));
		stock.add(new Produit(6,"lait",0.8,100));
		stock.add(new Produit(7,"oeuf",0.2,1000));
	}

	/** Instance unique prÃ©-initialisÃ©e */
	private static Stock INSTANCE = new Stock();

	/** Point d'accÃ¨s pour l'instance unique du singleton */
	public static Stock getInstance()
	{   return INSTANCE;
	}
	
	public Stock(Collection<Produit> st){
		this.stock=st;
	}
	
	public void addProduit(Produit p) throws ErreurProduit{
		
		if (produitPresent(p)){
			throw new ErreurProduit("produit déja présent");
		}
		else{
			this.stock.add(p);
		}
	}

	private boolean produitPresent(Produit p){
		boolean estPresent=false;
		for (Produit produit:stock){
			if (produit.getId_produit()==p.getId_produit()){
				estPresent=true;
					
				
			}
		}
		return estPresent;
	}
	
	public void addQuantite(Produit p,int quant) throws ErreurProduit{
		if (produitPresent(p)){
			p.setQuantite(p.getQuantite()+quant);
		}else{
			throw new ErreurProduit("produit non répertorié");
		}
	}
}
