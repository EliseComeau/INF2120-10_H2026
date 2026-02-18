/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 4 Interface
 
*/

public class NDouble implements Nombre <NDouble> {

    // Variable d'instance

    private double valeur;


    // Méthodes

    public NDouble() {
    }

    public NDouble(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur() {
        return this.valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public NDouble add(NDouble x) {
        return new NDouble(this.valeur + x.valeur);
    }

    @Override
    public NDouble sub(NDouble x) {
        return new NDouble(this.valeur - x.valeur);
    }

    @Override
    public NDouble mul(NDouble x) {
        return new NDouble(this.valeur * x.valeur);
    }

    @Override
    public NDouble div(NDouble x) {
        return new NDouble(this.valeur / x.valeur);
    }

    public String toString() {
        return String.valueOf(this.valeur);
    }   

}






