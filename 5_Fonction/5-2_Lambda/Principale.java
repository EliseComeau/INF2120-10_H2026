/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 5.2 Lambda
 
*/

import java.util.function.Function;
import java.util.ArrayList;

public class Principale {

    public static void main (String [] args) {

        // *** EXERCICE 5.2.1 ***

        // 5.2.1 : définition d'une fonction lambda

        Function <ArrayList <String>, String> funcLambda521 = (listeDeMots) -> {
                                                                    
            String chaineConcat = "";

            if (listeDeMots.size() != 0) {

                chaineConcat = listeDeMots.get(0);

                for(int i = 1; i < listeDeMots.size(); ++ i) {
                    chaineConcat += ", " + listeDeMots.get(i);
                }
            }

            return chaineConcat;
        };


        // 5.2.1 : application d'une fonction lambda

        ArrayList <String> listeDeMots = new ArrayList <> ();

        listeDeMots.add("allo");
        listeDeMots.add("comment");
        listeDeMots.add("ca");
        listeDeMots.add("va");

        System.out.println(funcLambda521.apply(listeDeMots));



        // *** EXERCICE 5.2.2 ***

        // 5.2.2 : création d'un ArrayList de fractions

        ArrayList <Fraction> listeDeFractions = new ArrayList <> ();

        listeDeFractions.add(new Fraction(1, 2));
        listeDeFractions.add(new Fraction(3, 4));


        // 5.2.2 : définition *et* application d'une fonction lambda

        listeDeFractions.forEach((fraction) -> fraction.setNum(2 * fraction.getNum()));

        System.out.println(listeDeFractions);



       // *** EXERCICE 5.2.3 ***

       // 5.2.3 : création d'un ArrayList de nombres aléatoires

        ArrayList <Integer> listeDeNombresAleas = new ArrayList <> ();

        MRand genNombreAlea = new MRand(10);

        for(int i = 0; i < 20; ++ i) {
            listeDeNombresAleas.add(genNombreAlea.get());
        }


        // 5.2.3 : définition *et* application d'une fonction lambda

        System.out.println(listeDeNombresAleas);

        listeDeNombresAleas.removeIf((nombreAlea) -> nombreAlea < 4);
                                                                       
        System.out.println(listeDeNombresAleas);
    
    }
        
}
