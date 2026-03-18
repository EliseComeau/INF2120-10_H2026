/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 1.2 Révision
 
*/

public class NonTaxable {

    // Variables d'instance

    private String nom;
    private double prix;


    // Méthodes

    public NonTaxable() {
    }

    public NonTaxable(String nom, double prix) {

        this.nom = nom;
        this.prix = prix;

    }

    public double prix() {
        return this.prix;
    }

}