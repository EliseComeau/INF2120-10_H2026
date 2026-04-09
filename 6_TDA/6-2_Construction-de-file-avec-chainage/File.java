/*

  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
 Labo 6.2: TDA - Construction de file avec chainage
 
*/

public class File <T> {

    private static class Noeud <T> {

        // Variables d'instance classe Noeud

        T valeur;
        Noeud <T> suivant;


        // Méthode classe Noeud

        Noeud (T valeur) {

            this.valeur = valeur;
            this.suivant = null;
        }
    }


    // Variables d'instance classe File

    private Noeud <T> premier;
    private Noeud <T> dernier;
    private int taille;


    // Méthodes classe File

    public File () {

        premier = null; 
        dernier = null;
        taille = 0;

    }

    public int taille () {
        return taille;
    }

    public boolean estVide () {
        return taille == 0;
    }

    public T tete() throws FileVide {

        if (this.estVide()) {
            throw new FileVide("La file est vide");
        }

        return premier.valeur;
    }

    public void enfiler (T element) {

        Noeud <T> nouveau = new Noeud <> (element);

        if (this.estVide()) {

            premier = nouveau;
            dernier = nouveau;

        } else {

            dernier.suivant = nouveau;
            dernier = nouveau;
        }

        taille++;
    }

    public T defiler() throws FileVide {

        if (this.estVide()) {
            throw new FileVide("La file est vide");
        }        

        T valeur = premier.valeur;
        premier = premier.suivant;

        if (premier == null) {
            dernier = null;
        }

        taille--;

        return valeur;
    }
}