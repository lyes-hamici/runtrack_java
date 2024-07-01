import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Récupération et affichage d'une chaîne de caractères
        System.out.print("Entrez une chaîne de caractères : ");
        String texte = scanner.nextLine();
        System.out.println("Vous avez entré : " + texte);

        // Fermeture du scanner
        scanner.close();
    }
}
