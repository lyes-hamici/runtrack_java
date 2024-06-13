package Jour04.Job02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne de caractères à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String randomString = generateRandomString(length);
                writeToFile(randomString, "Jour04\\Job02\\output.txt");
            }
        });

        thread.start();

        try {
            thread.join();
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

        System.out.println("Chaîne générée : " + stringBuilder.toString()); // Debugging line
        return stringBuilder.toString();
    }

    private static void writeToFile(String data, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
            System.out.println("Données écrites dans le fichier : " + filename); // Debugging line
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
