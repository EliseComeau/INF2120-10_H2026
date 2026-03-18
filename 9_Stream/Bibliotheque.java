/*
  Cours : INF2120 - 10
  Auxiliaire : Élise Comeau
 
 Labo 9 : Client
 NOTE : cette classe *n'est pas* fournie dans l'énoncé
 
*/

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    // Constante de classe

    public static final long LIMITE_PAR_CLIENT = 5;


    // Variables d'instance

    private List <Client> clients;
    private List <Livre> livres;
    private List <Emprunt> emprunts;


    // Méthodes

    public Bibliotheque() {

        clients = new ArrayList <> ();
        livres = new ArrayList <> ();
        emprunts = new ArrayList <> ();
    }

    // Exercice 9.1.2 

    public boolean estEmprunte(Livre livre) {
        return emprunts.stream().anyMatch((e) -> e.emprunte.equals(livre));
    }















    public long nombreEmprunt(Client client) {
        return emprunts.stream().filter((e) -> e.emprunteur.equals(client)).count();
    }

    public void emprunter(Client client, Livre livre) {

        if (nombreEmprunt(client) == LIMITE_PAR_CLIENT) {
            throw new ClientAtteintLimite("" + LIMITE_PAR_CLIENT);
        }

        if (estEmprunte(livre)) {
            throw new LivreDejaEmprunte(livre.cote);
        }

        emprunts.add(new Emprunt(client, livre));
    }

    public void afficherLivresDisponibles() {
        livres.stream().filter((livre) -> ! estEmprunte(livre)).forEach((livre) -> System.out.println(livre.titre));
    }

    public Object [] listeEmprunt(Client client) {
        return emprunts.stream().filter((e) -> e.emprunteur.equals(client)).map((e) -> e.emprunte).toArray();
    }

    public double valeurInventaire() {
        return livres.stream().mapToDouble((livre) -> livre.prix).sum();
    }

    public void devaloriser(double perte) {
        livres.stream().forEach((livre) -> livre.prix = livre.prix * (1.0 - perte));
    }
}
