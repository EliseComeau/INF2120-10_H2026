/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 2.2 Méthodes abstraites
 
*/

public class Principale {

    public static void main(String [] args) {

        Forme3D [] tab = {new Sphere(2.0), new CylindreDroit(new Cercle(3.0), 2.0), new CylindreDroit(new Rectangle(5.0, 2.3), 1.5)};

        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + "\nvolume = " + tab[i].volume() + "\n");
        }
    }
}
