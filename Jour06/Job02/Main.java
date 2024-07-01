import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande du prénom de l'utilisateur
        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();

        // Affichage du message de bienvenue
        System.out.println("Bonjour " + prenom + " !");

        // Fermeture du scanner
        scanner.close();
    }
}
