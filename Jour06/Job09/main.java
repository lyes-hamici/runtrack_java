import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier n
        System.out.print("Entrez un nombre entier n : ");
        int n = scanner.nextInt();

        // Calcul de la somme des n premiers cubes
        int sommeCubes = 0;
        for (int i = 1; i <= n; i++) {
            sommeCubes += i * i * i;
        }

        // Affichage de la somme des n premiers cubes
        System.out.println("La somme des " + n + " premiers cubes est : " + sommeCubes);

        // Fermeture du scanner
        scanner.close();
    }
}
