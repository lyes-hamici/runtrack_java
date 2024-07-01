import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir trois nombres
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        System.out.print("Entrez le troisième nombre : ");
        double nombre3 = scanner.nextDouble();

        // Calcul du maximum des trois nombres
        double maxNombre = Math.max(Math.max(nombre1, nombre2), nombre3);

        // Affichage du maximum des trois nombres
        System.out.println("Le maximum des trois nombres est : " + maxNombre);

        // Fermeture du scanner
        scanner.close();
    }
}
