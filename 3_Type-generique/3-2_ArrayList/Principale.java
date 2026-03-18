/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 3.2 ArrayList
 
*/

import java.util.ArrayList;  // N'oubliez pas cette ligne, sinon vous ne pourrez pas construire de ArrayList!


public class Principale {

    public static ArrayList <Double> tweens(double depart, double fin, int nbrInterval) {

        ArrayList <Double> liste = new ArrayList <Double> ();

        double increment = (fin - depart) / nbrInterval;
        double valeur;

        for (int i = 0; i <= nbrInterval; i++) {

            valeur = depart + increment * i;
            liste.add(valeur);
        }

        return liste;

    }

    public static void main (String [] args) {

        // Test pour la méthode tweens

        ArrayList <Double> liste = tweens(1.0, 3.0, 4);
        System.out.println(liste);

    }

}