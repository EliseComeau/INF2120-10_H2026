/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.2 Méthodes abstraites
 
*/

public class Sphere extends Forme3D {

    // Variable d'instance

    private double rayon;


    // Méthodes

    public Sphere() {
    }

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return this.rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double volume() {
        return (4.0/3) * Math.PI * Math.pow(rayon, 3);
    }

    @Override
    public String toString() {
        return "sphere :\n" + "rayon = " + this.rayon;
    }

}