/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.1 Héritage
 
*/

public class NonTaxable extends Produit {

    public NonTaxable(String nomProduit, double prix) {
        super(nomProduit, prix);
    }

    @Override
    public double prix() {
        return prix;
    }
}
