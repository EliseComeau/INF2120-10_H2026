/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 1.1 Référence
 
*/

public class Couleur {

    // Constantes

    private final int VAL_MIN = 0;
    private final int VAL_MAX = 255;
    private final int VAL_DEFAUT = (int) (VAL_MIN + VAL_MAX) / 2;

    private final String MSG_ERR = "La valeur entrée est invalide; la nouvelle valeur sera : " + VAL_DEFAUT;
    

    // Variables d'instances

    private int rouge;
    private int vert;
    private int bleu;


    // Méthodes

    public Couleur() {
    }

    public Couleur(int rouge, int vert, int bleu) {

        setRouge(rouge);
        setVert(vert);
        setBleu(bleu);

    }

    public int getRouge() {
        return this.rouge;
    }

    public int getVert() {
        return this.vert;
    }

    public int getBleu() {
        return this.bleu;
    }

    public void setRouge(int rouge) {

        if ((rouge < VAL_MIN) || (rouge > VAL_MAX)) {

            System.out.println(MSG_ERR);
            this.rouge = VAL_DEFAUT;

        } else { 
            this.rouge = rouge;
        }

    }

    public void setVert(int vert) {

        if ((vert < VAL_MIN) || (vert > VAL_MAX)) {

            System.out.println(MSG_ERR);
            this.vert = VAL_DEFAUT;

        } else { 
            this.vert = vert;
        }
    }

    public void setBleu(int bleu) {

        if ((bleu < VAL_MIN) || (bleu > VAL_MAX)) {

            System.out.println(MSG_ERR);
            this.bleu = VAL_DEFAUT;

        } else { 
            this.bleu = bleu;
        }
    }

    public String toString() {
        return "rouge : " + this.rouge + "\nvert : " + this.vert + "\nbleu : " + this.bleu + "\n";
    }

    public void blanchir() {

        this.rouge = ( this.rouge + VAL_MAX ) / 2;
        this.vert = ( this.vert + VAL_MAX ) / 2;
        this.bleu = ( this.bleu + VAL_MAX ) / 2;

    }

}