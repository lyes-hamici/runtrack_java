import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier n (inférieur ou égal à 9)
        System.out.print("Entrez un nombre entier n (inférieur ou égal à 9) : ");
        int n = scanner.nextInt();

        // Vérification que n est inférieur ou égal à 9
        if (n <= 9 && n >= 1) {
            // Affichage de la table de multiplication de n
            System.out.println("Table de multiplication de " + n + " :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Le nombre saisi n'est pas inférieur ou égal à 9.");
        }

        // Fermeture du scanner
        scanner.close();
    }
}
