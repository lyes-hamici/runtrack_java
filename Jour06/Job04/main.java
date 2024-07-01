import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande du nom de l'utilisateur
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        // Affichage du message de bienvenue
        System.out.println("Bienvenue, " + nom + "!");

        // Fermeture du scanner
        scanner.close();
    }
}
