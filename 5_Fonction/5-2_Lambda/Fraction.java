/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
 Labo 5.2 : Lambda
 NOTE : cette classe a été copiée du Labo 4 (Interface)
 
*/

public class Fraction implements Nombre <Fraction> {

    // Variables d'instances

    private int num;
    private int denom;


    // Méthodes

    public Fraction() {
    }

    public Fraction(int num, int denom) {

        this.num   = num;
        this.denom = denom;
    }

    public int getNum() {
        return this.num;
    }

    public int getDenom() {
        return this.denom;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    @Override
    public Fraction add(Fraction f) {

        int nouveauNum   = this.num * f.denom + this.denom * f.num;
        int nouveauDenom = this.denom * f.denom;

        return new Fraction(nouveauNum, nouveauDenom);

    }

    @Override
    public Fraction sub(Fraction f) {

        int nouveauNum   = this.num * f.denom - this.denom * f.num;
        int nouveauDenom = this.denom * f.denom;

        return new Fraction(nouveauNum, nouveauDenom);

    }

    @Override
    public Fraction mul(Fraction f) {

        int nouveauNum   = this.num   * f.num;
        int nouveauDenom = this.denom * f.denom;

        return new Fraction(nouveauNum, nouveauDenom);

    }

    @Override
    public Fraction div(Fraction f) {

        int nouveauNum   = this.num   * f.denom;
        int nouveauDenom = this.denom * f.num;

        return new Fraction(nouveauNum, nouveauDenom);

    }

    public String toString() {
        return this.num + "/" + this.denom;
    }

}




