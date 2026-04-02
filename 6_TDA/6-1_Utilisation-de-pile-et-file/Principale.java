/*

  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
 Labo 6.1: TDA - Utilisation de pile et de file
 
*/

import java.util.Deque;
import java.util.ArrayDeque;

public class Principale {

    // Exercice 6.1.1

    public static Deque <String> inverserOrdre (Deque <String> pileInit) {

        Deque <String> pileFinale = new ArrayDeque <> ();

        while (! pileInit.isEmpty()) {

            String elem = pileInit.removeLast();
            pileFinale.addLast(elem);

        }

        return pileFinale;

    }


    // Exercice 6.1.2

    public static void inverserOrdre2 (Deque <String> pileInit) {

        Deque <String> fileTemp = new ArrayDeque <> ();

        while (! pileInit.isEmpty()) {

            String elem = pileInit.removeLast();
            fileTemp.addLast(elem);

        }

        while (! fileTemp.isEmpty()) {

            String elem = fileTemp.removeFirst();
            pileInit.addLast(elem);

        }

    }


    // Exercice 6.1.3

    public static boolean parenthesageCorrect(String chaine) {

        boolean pC = true;
        Deque <Character> caracs = new ArrayDeque <> ();
        int i = 0;

        while ((i < chaine.length()) && pC) {

            char carac = chaine.charAt(i);

            if ((carac == '(') || (carac == '[') || (carac =='{')) {
                caracs.addLast(carac);
            }

            else if (carac == ')') {

                char sommet = caracs.peek();

                if (sommet == '(') {
                    caracs.removeLast();
                } else {
                   pC = false;
                } 
                
            }

            else if (carac == ']') {

                char sommet = caracs.peek();

                if (sommet == '[') {
                    caracs.removeLast();
                } else {
                   pC = false;
                } 
                
            }

            else if (carac == '}') {

                char sommet = caracs.peek();

                if (sommet == '{') {
                    caracs.removeLast();
                } else {
                   pC = false;
                } 
                
            }
            i++;

        }

        return pC;

    }
    

    public static void main (String [] args) {

        // Test pour exercice 6.1.1

        Deque <String> deque1 = new ArrayDeque <> ();

        deque1.addLast("A");
        deque1.addLast("B");
        deque1.addLast("C");

        System.out.println(deque1);

        Deque <String> deque2 = inverserOrdre(deque1);

        System.out.println(deque2);
        System.out.println();


        // Test pour exercice 6.1.2

        Deque <String> deque3 = new ArrayDeque <> ();

        deque3.addLast("D");
        deque3.addLast("E");
        deque3.addLast("F");

        System.out.println(deque3);

        inverserOrdre2(deque3);

        System.out.println(deque3);
        System.out.println();


        // Test pour exercice 6.1.3

        String bonneChaine = "(x + y)";
        String mauvaiseChaine = "(x + y}";

        System.out.println(parenthesageCorrect(bonneChaine));
        System.out.println(parenthesageCorrect(mauvaiseChaine));

    }

}