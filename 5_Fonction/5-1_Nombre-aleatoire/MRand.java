/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 5.1 Nombre aléatoire
 
*/

import java.util.function.Supplier;

public class MRand implements Supplier <Integer> {

    // Constantes de classe (utilisées pour calculer les nombres aléatoires)

    protected static final long M    = 0x1000_0000_0000L;
    protected static final long A    = 0x5_DEEC_E66DL;
    protected static final long C    = 11L;
    protected static final long MASK = 0x0000_7FFF_FFFF_0000L;
    protected static final int DEC   = 16;


    // Variables d'instance

    protected long x              = 0L;                   // valeur pour le nombre aléatoire courant
    protected int borneSuperieure = Integer.MAX_VALUE;    // valeur maximale pour les nombres aléatoires suivants


    // Méthodes

    public MRand() {
    }

    public MRand(long x) {
        this.x = x;
    }

    public MRand(int borneSuperieur) {
        this.borneSuperieure = borneSuperieur;
    }

    public MRand(long x, int borneSuperieur) {

        this.x = x;
        this.borneSuperieure = borneSuperieur;
    }

    @Override
    public Integer get() {

        x     = (A * x + C) % M;
        int r = ((int)(( x & MASK ) >> DEC)) % borneSuperieure;

        return r;
    }

}
