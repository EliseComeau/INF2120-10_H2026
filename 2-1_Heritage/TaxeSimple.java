/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.1 Héritage
 
*/

public class TaxeSimple extends Produit {

    public TaxeSimple(String nomProduit, double prix) {
        super(nomProduit, prix);
    }

    @Override
    public double prix() {
        return this.prix * (1 + Constantes.TAUX_TPS);
    }
}
