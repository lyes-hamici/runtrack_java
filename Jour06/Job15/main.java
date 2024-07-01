import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        // Conversion du nombre en chaîne de caractères pour faciliter l'inversion
        String nombreStr = String.valueOf(nombre);

        // Inversion de la chaîne de caractères
        String nombreInverseStr = new StringBuilder(nombreStr).reverse().toString();

        // Affichage du nombre inversé
        System.out.println("Le nombre inversé est : " + nombreInverseStr);

        // Fermeture du scanner
        scanner.close();
    }
}
