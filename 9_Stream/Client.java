/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
 Labo 9 : Client
 NOTE : cette classe est fournie dans l'énoncé
 
*/

public class Client {

    // Variables d'instance

    public String nom;
    public String prenom;
    public long noUsage;


    // Méthodes

    public Client(String nom, String prenom, long noUsage) {

        this.nom = nom;
        this.prenom = prenom;
        this.noUsage = noUsage;

    }

    @Override                               // cette métode est héritée de la classe Object qui est ...
    public boolean equals(Object obj) {     // ... la classe mère de toutes les autres classes Java

        return switch(obj) {

            case Client client -> noUsage == client.noUsage; // fonction lambda
            default -> false;

        };

        
    }
}
