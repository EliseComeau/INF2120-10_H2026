/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.2 Méthodes abstraites
 
*/

public class Rectangle extends Forme2D {

    // Variables d'instance

    private double hauteur;
    private double largeur;


    // Méthodes

    public Rectangle() {
    }

    public Rectangle(double hauteur, double largeur) {

        this.hauteur = hauteur;
        this.largeur = largeur;

    }

    public double getHauteur() {
        return this.hauteur;
    }

    public double getLargeur() {
        return this.largeur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        return this.hauteur * this.largeur;
    }

    @Override
    public String toString() {
        return "rectangle :\n" + "hauteur = " + this.hauteur + "\n" + "largeur = " + this.largeur;
    } 

}