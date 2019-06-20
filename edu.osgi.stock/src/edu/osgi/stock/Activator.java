package edu.osgi.stock;

import java.util.Collection;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import edu.osgi.api.Produit;

public class Activator implements BundleActivator {
	

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		
		initializeStock();
		
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		
	}
	
	private void initializeStock(){
		Collection<Produit> collectionProduit = null;
		collectionProduit.add(new Produit(1,"carotte",1.5,100));
		collectionProduit.add(new Produit(2,"tomate",1.5,100));
		collectionProduit.add(new Produit(3,"saucisson",3,100));
		collectionProduit.add(new Produit(4,"navet",1,100));
		collectionProduit.add(new Produit(5,"boeuf",12,100));
		collectionProduit.add(new Produit(6,"lait",0.8,100));
		collectionProduit.add(new Produit(7,"oeuf",0.2,1000));
		Stock stock=new Stock(collectionProduit);
		
	}

}
