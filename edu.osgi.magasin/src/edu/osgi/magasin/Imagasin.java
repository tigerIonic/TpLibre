package edu.osgi.magasin;

import edu.osgi.client.Iclient;

import java.util.Collection;

public interface Imagasin {

    void enregistrerClient(Iclient client) throws Exception;

    boolean produitDisponible(int idP, int quant);

    Commande getCommande(int id) throws Exception;

    void realiserTransaction(int idClient) throws Exception;

    Imagasin getCommande();

    Collection<Commande> getCommandes();

    void setCommandes(Collection<Commande> commandes);

    Collection<Iclient> getClients();

    Iclient getClient(int idClient) throws Exception;

    void setClients(Collection<Iclient> clients);

    Catalogue getCatalogue();

    void setCatalogue(Catalogue catalogue);

	void ajoutProduit(String libelle_produit, int quantite);
}
