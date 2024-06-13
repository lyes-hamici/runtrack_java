package Jour04.Job03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne de caractères à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        String randomString = generateRandomString(length);

        int mid = length / 2;

        Thread thread1 = new Thread(new WriteToFileTask(randomString.substring(0, mid), "Jour04\\Job03\\output.txt", false));
        Thread thread2 = new Thread(new WriteToFileTask(randomString.substring(mid), "Jour04\\Job03\\output.txt", true));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Temps d'exécution: " + (endTime - startTime) + " ms");
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(index));
        }

        return stringBuilder.toString();
    }

    static class WriteToFileTask implements Runnable {
        private final String data;
        private final String filename;
        private final boolean append;

        public WriteToFileTask(String data, String filename, boolean append) {
            this.data = data;
            this.filename = filename;
            this.append = append;
        }

        @Override
        public void run() {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, append))) {
                writer.write(data);
                System.out.println("Données écrites dans le fichier : " + filename + " par " + Thread.currentThread().getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

