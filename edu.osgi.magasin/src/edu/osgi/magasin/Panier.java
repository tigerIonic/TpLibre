package edu.osgi.magasin;

import java.util.Collection;

import edu.osgi.stock.Produit;

public class Panier {
	private int idPanier;
	
	public int getIdPanier() {
		return idPanier;
	}

	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}

	private Collection<Produit> colProduit;
	
	public Panier(){
		
	}
	
	public Panier(Produit pro){
		this.colProduit.add(pro);
	}
	
	public Panier(Collection<Produit> col){
		this.colProduit=col;
	}
	
	public Collection<Produit> getColProduit(){
		return this.colProduit;
	}
	
	public void AddProduit(Produit p){
		boolean EstPresent=false;
		
		for (Produit produit:colProduit){
			if (produit.getId_produit()==p.getId_produit()){
				EstPresent=true;
				produit.setQuantite(produit.getQuantite()+p.getQuantite());
			}
		}
		
		if (!EstPresent){
			this.colProduit.add(p);
		}
		
	}
	
	public void removeProduit(int id){
		
		
		for (Produit produit:colProduit){
			if (id==produit.getId_produit()){
				this.colProduit.remove(produit);
			}
	}
	}}

