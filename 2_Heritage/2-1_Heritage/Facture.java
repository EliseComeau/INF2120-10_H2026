/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.1 Héritage
 
*/

public class Facture {

    private static final int NBR_MAXIMUM = 30;

    private Produit[] produits = new Produit[NBR_MAXIMUM];

    private int nbrProduit = 0;

    public void ajouterProduit(Produit produit) {

        if(nbrProduit < NBR_MAXIMUM) {

            produits[nbrProduit] = produit;
            ++ nbrProduit;

        } else {
            System.out.println("Dépassé le maximum d'éléments pour une facture.");
        }
    }

    public double prixTotal() {

        double somme = 0.0;

        for(int i = 0; i < nbrProduit; ++ i) {
            somme += produits[i].prix();
        }

        return somme;
    }
}
