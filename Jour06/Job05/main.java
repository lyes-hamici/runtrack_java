import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre : ");
        double nombre = scanner.nextDouble();

        // Calcul du carré du nombre
        double carre = nombre * nombre;

        // Affichage du carré du nombre
        System.out.println("Le carré de " + nombre + " est " + carre);

        // Fermeture du scanner
        scanner.close();
    }
}
