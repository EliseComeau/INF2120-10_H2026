/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
 Labo 9 : Client
 NOTE : cette classe est fournie dans l'énoncé
 
*/

public class Livre {

    // Variables d'instance

    public String cote;  // identifiant
    public String titre;
    public double prix;


    // Méthodes

    public Livre(String cote, String titre, double prix) {

        this.cote = cote;
        this.titre = titre;
        this.prix = prix;

    }

    @Override                              // cette métode est héritée de la classe Object qui est ...
    public boolean equals(Object obj) {    // ... la classe mère de toutes les autres classes Java

        return switch(obj) {

            case Livre livre -> cote.equals(livre.cote);
            default -> false;

        };

    }

}
