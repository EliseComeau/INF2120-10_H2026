/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 1.2 Révision
 
*/

public class TaxeSimple {

    // Variables d'instance

    private String nom;
    private double prix;


    // Méthodes

    public TaxeSimple() {
    }

    public TaxeSimple(String nom, double prix) {

        this.nom = nom;
        this.prix = prix;

    }

    public double prix() {
        return this.prix * (1 + Constantes.TAUX_TPS);
    }

}