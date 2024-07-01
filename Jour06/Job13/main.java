import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier n
        System.out.print("Entrez un nombre entier n : ");
        int n = scanner.nextInt();

        // Affichage des nombres pairs inférieurs ou égaux à n
        System.out.println("Nombres pairs inférieurs ou égaux à " + n + " :");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Fermeture du scanner
        scanner.close();
    }
}
