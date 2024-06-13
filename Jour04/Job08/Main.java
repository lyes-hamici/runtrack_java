package Jour04.Job08;


import java.util.concurrent.*;

public class Main {
    public static final int MAX_THREADS = 100; // Nombre maximal de threads à utiliser
    public static final int MAX_NUMBER = 10_000_000; // Limite supérieure pour le calcul de la somme

    public static void main(String[] args) {
        // Création d'un ExecutorService avec un pool de threads fixe
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);

        // Division de la tâche en plusieurs parties
        int numThreads = Math.min(MAX_THREADS, MAX_NUMBER); // Nombre de threads à utiliser
        int numbersPerThread = MAX_NUMBER / numThreads;

        // Utilisation de Future pour obtenir les résultats de chaque thread
        Future<Long>[] futures = new Future[numThreads];
        
        long startTime = System.currentTimeMillis();

        // Soumission des tâches aux threads
        for (int i = 0; i < numThreads; i++) {
            final int start = i * numbersPerThread + 1;
            final int end = (i == numThreads - 1) ? MAX_NUMBER : (i + 1) * numbersPerThread;
            
            Callable<Long> task = new SumCalculator(start, end);
            futures[i] = executor.submit(task);
        }

        // Récupération des résultats partiels et calcul de la somme totale
        long totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                totalSum += futures[i].get(); // Attendre et obtenir le résultat du thread
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Affichage des résultats
        System.out.println("La somme de tous les entiers de 1 à " + MAX_NUMBER + " est : " + totalSum);
        System.out.println("Temps d'exécution avec " + numThreads + " threads : " + executionTime + " ms");

        // Arrêt propre de l'ExecutorService
        executor.shutdown();
    }
}

