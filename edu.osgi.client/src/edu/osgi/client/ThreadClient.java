package edu.osgi.client;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import edu.osgi.api.Produit;

public class ThreadClient extends Thread {
	// Délai de pause du Thread
	public static final int delay = 10000;
	// Context du bundle lié au Thread
	private BundleContext context = null;
	/**
	* Constructeur, le Thread a besoin du BundleContext pour rechercher le
	* service
	*
	* @param aContext
	*/
	public ThreadClient(BundleContext aContext) {
	context = aContext;
	}
	/**
	* Méthode run qui sera appelée par the Thread.start()
	*/
	public void run() {
	System.out.println("Demarrage du Thread Client");
	
	System.out.println("Création client 1");
	Client cl1 = new Client(1, "xabi", 12.1);
	cl1.setIdCommande(1);
	System.out.println("Création client 2");
	Client cl2 = new Client(2, "Gaétan", 12.1);
	cl2.setIdCommande(2);
	}
	
	
	/**
	* Implémentation des Traitements du Thread
	*/
	/*
	private void repairCar(int carId) {
	// Création d'une voiture
	Car aCar = null;
	if (Math.random() > 0.5) {
	aCar = new Megane(carId);
	} else {
	aCar = new Lada(carId);
	}
	// Récupération du service
	ServiceReference<CarRepairer> carRepairerSR = context
	.getServiceReference(CarRepairer.class);
	if (carRepairerSR == null) {
	System.out.println("\n**************\nAucun service disponible");
	} else {
	
	System.out.println("\n**************\nAppel du service:"
	+ carRepairerSR.getClass() + "\nDu bundle:"
	+ carRepairerSR.getBundle().getSymbolicName()
	+ "\nPour la voiture:" + aCar.getId() + ","
	+ aCar.getClass() + "," + aCar.getCurrentStatus());
	CarRepairer myService = context.getService(carRepairerSR);
	// Appel du service
	try {
	myService.repairCar(aCar);
	System.out.println("La voiture a bien été traitée : "
	+ aCar.getClass() + ":" + aCar.getCurrentStatus());
	} catch (CarRepairException e) {
	System.out
	.println("Erreur la voiture n'est pas au bon statut pour ce service : "
	+ aCar.getClass()
	+ ":"
	+ aCar.getCurrentStatus());
	}
	// Libération du service
	context.ungetService(carRepairerSR);
	}
	}
	*/
	}

