/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 1.2 Révision
 
*/

public class Facture {

    private static final int NBR_MAXIMUM = 10;

    private NonTaxable [] nonTaxables = new NonTaxable[NBR_MAXIMUM];
    private TaxeSimple [] taxeSimples = new TaxeSimple[NBR_MAXIMUM];
    private TaxeDouble [] taxeDoubles = new TaxeDouble[NBR_MAXIMUM];

    private int nbrNonTaxable = 0;  // nombre d'objets NonTaxable placés dans le tableau nonTaxable
    private int nbrTaxeSimple = 0;
    private int nbrTaxeDouble = 0;

    public void ajouterProduitNonTaxable(NonTaxable produit) {

        if(nbrNonTaxable < NBR_MAXIMUM) {

            nonTaxables[nbrNonTaxable] = produit;
            ++ nbrNonTaxable;

        } else {
            System.out.println("Dépassé le maximum d'éléments nonTaxables pour une facture.");
        }
    }

    public void ajouterProduitTaxeSimple(TaxeSimple produit) {

        if(nbrTaxeSimple < NBR_MAXIMUM) {

            taxeSimples[nbrTaxeSimple] = produit;
            ++ nbrTaxeSimple;

        } else {
            System.out.println("Dépassé le maximum d'éléments taxeSimple pour une facture.");
        }
    }

    public void ajouterProduitTaxeDouble(TaxeDouble produit) {

        if(nbrTaxeDouble < NBR_MAXIMUM) {

            taxeDoubles[nbrTaxeDouble] = produit;
            ++ nbrTaxeDouble;

        } else {
            System.out.println("Dépassé le maximum d'éléments taxeDouble pour une facture.");
        }
    }

    public double prixTotal() {

        double somme = 0.0;

        for(int i = 0; i < nbrNonTaxable; ++ i) {
            somme += nonTaxables[i].prix();
        }

        for(int i = 0; i < nbrTaxeSimple; ++ i) {
            somme += taxeSimples[i].prix();
        }

        for(int i = 0; i < nbrTaxeDouble; ++ i) {
            somme += taxeDoubles[i].prix();
        }

        return somme;
    }

}