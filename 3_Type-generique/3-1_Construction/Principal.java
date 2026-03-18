/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 3.1 Construction
 
*/

import java.util.Optional;

public class Principal {

    // Méthodes

    public static <T> PeutEtre <Integer> trouverElement(T[] a_tableau, T a_element) {

        PeutEtre <Integer> resultat = null;
        int i = 0;

        while(i < a_tableau.length && !a_tableau[i].equals(a_element)) {
            ++i;
        }

        if(i < a_tableau.length) {
            resultat = new QQChose <>(i);
        } else {
            resultat = new Rien <>();
        }

        return resultat;
    }

    public static <T> Optional <Integer> trouverElementV2(T[] a_tableau, T a_element) {

        Optional <Integer> resultat = null;
        int i = 0;

        while(i < a_tableau.length && !a_tableau[i].equals(a_element)) {
            ++ i;
        }

        if(i < a_tableau.length) {
            resultat = Optional.of(i);
        } else {
            resultat = Optional.empty();
        }

        return resultat;
    }

    public static void main(String [] args) {

        Integer [] tab = {9, 7, 5, 3, 1};
        Integer element = 0;

        PeutEtre <Integer> rep = trouverElement(tab, element);
        Optional <Integer> rep2 = trouverElementV2(tab, element);

        System.out.println(rep);
        System.out.println(rep2);

    }
}

