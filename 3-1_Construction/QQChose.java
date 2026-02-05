/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 3.1 Construction
 
*/

public class QQChose <T> extends PeutEtre<T> {

    // Variable d'instance

    protected T valeur;


    // Méthodes

    public QQChose(T a_valeur) {
        valeur = a_valeur;
    }

    public boolean estQQChose() {
        return true;
    }

    public boolean estRien() {
        return false;
    }

    public T qQChose() throws ARien {
        return valeur;
    }

}