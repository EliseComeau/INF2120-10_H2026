/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 1.2 Révision
 
*/

public class TaxeDouble {

    // Variables d'instance

    private String nom;
    private double prix;


    // Méthodes

    public TaxeDouble() {
    }

    public TaxeDouble(String nom, double prix) {

        this.nom = nom;
        this.prix = prix;

    }

    public double prix() {
        return this.prix * (1 + Constantes.TAUX_TPS + Constantes.TAUX_TVQ);  // N'oubliez pas d'ajouter les *deux* taxes!
    }

}