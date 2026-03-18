/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.1 Héritage
 
*/

public class Produit {

    // Variables d'instance

    protected String nom;
    protected double prix;


    // Méthodes

    public Produit() {
    }

    public Produit(String nom, double prix) {

        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return 0;
    }

    public String getNom() {
        return this.Nom;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setNom(String nom) {
       this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}
