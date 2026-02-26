/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 5.1 Nombre aléatoire
 
*/

import java.util.Arrays;
import java.util.function.Supplier;

public class Principale {

    // Constantes de classe

    public static final int MAX        = 100;
    public static final int NB_VALEURS = 1_000_000;


    // Méthodes

    public static void tester(Supplier <Integer> s) {

        int [] tab = new int[MAX];

        for(int i = 0; i < NB_VALEURS; ++i) {
            ++tab[s.get()];
        }

        System.out.println(Arrays.toString(tab));

    }
        
    public static void main(String [] args) {

        MRand random = new MRand(MAX);

        tester(random);

    }
}
