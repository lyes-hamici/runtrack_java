package Jour04.Job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Créer le tableau et le remplir avec des nombres saisis par l'utilisateur
        int[] tableau = new int[taille];
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            tableau[i] = scanner.nextInt();
        }

        // Créer deux threads pour calculer la somme en parallèle
        int milieu = taille / 2;
        int[] moitie1 = new int[milieu];
        int[] moitie2 = new int[taille - milieu];
        System.arraycopy(tableau, 0, moitie1, 0, milieu);
        System.arraycopy(tableau, milieu, moitie2, 0, taille - milieu);

        SumThread thread1 = new SumThread(moitie1);
        SumThread thread2 = new SumThread(moitie2);

        long startTime = System.nanoTime();

        thread1.start();
        thread2.start();

        // Attendre que les deux threads aient terminé
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Obtenir les résultats des threads
        int sum1 = thread1.getSum();
        int sum2 = thread2.getSum();

        // Calculer la somme totale
        int sommeTotale = sum1 + sum2;

        long endTime = System.nanoTime();
        long tempsExecution = endTime - startTime;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme des éléments du tableau est : " + sommeTotale);
        System.out.println("Temps d'exécution en parallèle avec deux threads : " + tempsExecution + " nanosecondes");

        scanner.close();
    }
}

class SumThread extends Thread {
    private int[] tableau;
    private int sum;

    public SumThread(int[] tableau) {
        this.tableau = tableau;
        this.sum = 0;
    }

    public void run() {
        // Calculer la somme des éléments du tableau assigné à ce thread
        for (int nombre : tableau) {
            sum += nombre;
        }
    }

    public int getSum() {
        return sum;
    }
}
