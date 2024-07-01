import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier n
        System.out.print("Entrez un nombre entier n pour calculer sa factorielle : ");
        int n = scanner.nextInt();

        // Vérification si n est négatif
        if (n < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
        } else {
            // Calcul de la factorielle de n
            long factorielle = 1;
            for (int i = 1; i <= n; i++) {
                factorielle *= i;
            }

            // Affichage du résultat
            System.out.println("La factorielle de " + n + " est : " + factorielle);
        }

        // Fermeture du scanner
        scanner.close();
    }
}
