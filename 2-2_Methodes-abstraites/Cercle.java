/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.2 Méthodes abstraites
 
*/

public class Cercle extends Forme2D {

    // Variable d'instance

    private double rayon;


    // Méthodes

    public Cercle() {
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return this.rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "cercle :\n" + "rayon = " + this.rayon;
    }

}