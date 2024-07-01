import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Déclaration des variables
        int somme = 0;
        int nombre;

        // Demande à l'utilisateur de saisir cinq entiers
        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez un entier (" + (i + 1) + "/5) : ");
            nombre = scanner.nextInt();
            somme += nombre;
        }

        // Calcul de la moyenne
        double moyenne = (double) somme / 5;

        // Affichage de la moyenne
        System.out.println("La moyenne des cinq entiers est : " + moyenne);

        // Fermeture du scanner
        scanner.close();
    }
}
