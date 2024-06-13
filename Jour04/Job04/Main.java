package Jour04.Job04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Créer un scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Veuillez saisir le nombre maximum à compter: ");
        int maxCount = scanner.nextInt();

        // Début du comptage du temps d'exécution
        long startTime = System.nanoTime();

        // Compter de 1 jusqu'au nombre maximum
        for (int i = 1; i <= maxCount; i++) {
            System.out.println(i);
        }

        // Fin du comptage du temps d'exécution
        long endTime = System.nanoTime();

        // Calculer le temps d'exécution
        long duration = endTime - startTime;

        // Afficher le compte total et le temps d'exécution
        System.out.println("Le comptage est terminé.");
        System.out.println("Temps d'exécution en nanosecondes: " + duration);
        System.out.println("Temps d'exécution en millisecondes: " + (duration / 1_000_000.0));
        System.out.println("Temps d'exécution en secondes: " + (duration / 1_000_000_000.0));
        
        // Fermer le scanner
        scanner.close();
    }
}
