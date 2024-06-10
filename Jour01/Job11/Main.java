package Jour01.Job11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un temps en minute : ");
        int minutes = scanner.nextInt();
        int heures = minutes / 60;
        int minutesRestantes = minutes % 60;

        System.out.println(minutes + " minutes équivalent à " + heures + " heures et " + minutesRestantes + " minutes.");

        scanner.close();
    }
}