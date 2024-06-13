package Jour04.Job05;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre maximum à compter : ");
        int maxNumber = scanner.nextInt();

        int mid = maxNumber / 2;

        Counter counter1 = new Counter(1, mid);
        Counter counter2 = new Counter(mid + 1, maxNumber);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        long startTime = System.currentTimeMillis();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalSum = counter1.getResult() + counter2.getResult();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Le compte total est : " + totalSum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");

        scanner.close();
    }
}
