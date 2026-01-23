/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.1 Héritage
 
*/

public class TaxeDouble extends Produit {

    public TaxeDouble(String nomProduit, double prix) {
        super(nomProduit, prix);
    }

    @Override
    public double prix() {
        return this.prix * (1 + Constantes.TAUX_TPS + Constantes.TAUX_TVQ);  // N'oubliez pas d'ajouter les *deux* taxes!
    }
}
