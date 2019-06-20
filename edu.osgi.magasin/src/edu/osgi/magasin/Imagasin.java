package edu.osgi.magasin;

public interface Imagasin {
    double getPrixPanier(int idPanier);

    double envoisFacture();

    boolean produitDisponible(int idP, int quant);

    void ajoutProduit(String libelle, int quantite);

    Imagasin getCommande();
}
