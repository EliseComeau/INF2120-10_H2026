/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.2 Méthodes abstraites
 
*/

public class CylindreDroit extends Forme3D {

    // Variables d'instance

    private Forme2D base;
    private double hauteur;


    // Méthodes

    public CylindreDroit() {
    }

    public CylindreDroit(Forme2D base, double hauteur) {

        this.base = base;
        this.hauteur = hauteur;

    }

    public Forme2D getBase() {
        return this.base;
    }

    public double getHauteur() {
        return this.hauteur;
    }

    public void setBase(Forme2D base) {
        this.base = base;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public double volume() {
        return this.base.aire() * this.hauteur;
    }

    @Override
    public String toString() {
        return "cylindre droit :\n" + this.base.toString() + "\n" + "hauteur = " + this.hauteur; 
    }

}