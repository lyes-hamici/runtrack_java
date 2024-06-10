package Jour01.Job13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int nombre = scanner.nextInt();

        for (int i = 0; i <= nombre; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}