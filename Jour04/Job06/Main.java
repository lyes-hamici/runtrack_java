package Jour04.Job06;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Créer le tableau et le remplir avec des nombres aléatoires
        int[] tableau = new int[taille];
        System.out.println("Le tableau initial est : ");
        for (int i = 0; i < taille; i++) {
            tableau[i] = (int) (Math.random() * 100); // Nombres aléatoires entre 0 et 99
            System.out.print(tableau[i] + " ");
        }
        System.out.println();

        // Demander à l'utilisateur le nombre de threads à utiliser
        System.out.print("Entrez le nombre de threads : ");
        int nombreThreads = scanner.nextInt();

        // Créer un ExecutorService avec un nombre fixe de threads
        ExecutorService executor = Executors.newFixedThreadPool(nombreThreads);

        // Mesurer le temps d'exécution avec plusieurs threads
        long startTime = System.nanoTime();

        // Définir le travail pour chaque thread
        int sum = 0;
        int chunkSize = taille / nombreThreads;
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);

        for (int i = 0; i < nombreThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == nombreThreads - 1) ? taille : start + chunkSize;

            completionService.submit(() -> {
                int partialSum = 0;
                for (int j = start; j < end; j++) {
                    partialSum += tableau[j];
                }
                return partialSum;
            });
        }

        // Récupérer les résultats partiels et calculer la somme totale
        try {
            for (int i = 0; i < nombreThreads; ++i) {
                sum += completionService.take().get();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Arrêter l'ExecutorService
        executor.shutdown();

        long endTime = System.nanoTime();
        long tempsExecution = endTime - startTime;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme des éléments du tableau est : " + sum);
        System.out.println("Temps d'exécution avec " + nombreThreads + " threads : " + tempsExecution + " nanosecondes");

        scanner.close();
    }
}

