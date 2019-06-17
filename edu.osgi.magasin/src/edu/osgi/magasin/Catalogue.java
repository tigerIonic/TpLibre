package edu.osgi.magasin;

import java.util.ArrayList;

public class Catalogue {
	public ArrayList listeProduit;
	
	public Catalogue(){
		
	}
	
	public Catalogue(ArrayList liste){
		this.listeProduit=liste;
	}
	
	public void getListe(){
		for (int index=0;index<this.listeProduit.size();index++){
			this.listeProduit.get(index);
		}
	}
	
}
