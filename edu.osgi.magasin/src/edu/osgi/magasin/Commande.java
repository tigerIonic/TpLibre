package edu.osgi.magasin;

import edu.osgi.client.Client;

public class Commande {
	private Client client;
	private Panier panier;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	
	
}
