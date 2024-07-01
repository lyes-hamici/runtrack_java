import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir son âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Vérification si l'utilisateur est mineur ou majeur
        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else {
            System.out.println("Vous êtes majeur.");
        }

        // Fermeture du scanner
        scanner.close();
    }
}
