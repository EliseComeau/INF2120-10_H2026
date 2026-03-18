/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 1.1 Référence
 
*/

public class Principal {

    public static void main(String [] args) {

        /*
          Avant d'exécuter le code, essaie de prédire les valeurs de rouge, vert et bleu qui seront affichées pour chaque print.
          Peux-tu expliquer les résultats obtenus?
        */ 

        Couleur c1 = new Couleur(1, 200, 6);
        Couleur c2 = c1;
        System.out.println(c2);

        c2.setRouge(100);
        System.out.println(c1);

        c1.blanchir();
        System.out.println(c1);
        System.out.println(c2);

    }

}