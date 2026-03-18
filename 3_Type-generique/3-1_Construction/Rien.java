/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
  Labo : 3.1 Construction
 
*/

public class Rien <T> extends PeutEtre<T> {

    // Méthodes

    public boolean estQQChose() {
        return false;
    }

    public boolean estRien() {
        return true;
    }

    public T qQChose() throws ARien {
        throw new ARien();
    }

}
