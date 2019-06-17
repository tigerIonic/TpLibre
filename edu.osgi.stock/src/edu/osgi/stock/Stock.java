package edu.osgi.stock;

import java.util.Collection;

public class Stock {
	private Collection<Produit> stock;
	
	public Stock(){
		
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
