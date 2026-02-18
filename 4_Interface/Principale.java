/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 4 Interface
 
*/

import java.util.ArrayList;


public class Principale {

    public static <N extends Nombre <N>> N somme (ArrayList <N> tableau) {

        N somme = null;

        if (!tableau.isEmpty()) {

            somme = tableau.get(0);

            for (int i=1; i < tableau.size(); i++) {
                somme = somme.add(tableau.get(i));
            }

        }

        return somme;
    }

    public static void main (String [] args) {

        // Test pour la classe NDouble

        ArrayList <NDouble> listeNDouble = new ArrayList <> ();

        listeNDouble.add(new NDouble(0.0));
        listeNDouble.add(new NDouble(1.0));
        listeNDouble.add(new NDouble(2.0));

        System.out.println(somme(listeNDouble));


        // Test pour la classe Fraction

        ArrayList <Fraction> listeFraction = new ArrayList <> ();

        listeFraction.add(new Fraction(1, 2));
        listeFraction.add(new Fraction(1, 4));
        listeFraction.add(new Fraction(2, 8));

        System.out.println(somme(listeFraction));
    
    }

}