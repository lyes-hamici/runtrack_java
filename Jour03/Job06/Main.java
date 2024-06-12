package Jour03.Job06;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Créer un tableau pour contenir 10 nombres entiers
        int[] tableau = new int[10];

        // Créer une instance de Random pour générer des nombres aléatoires
        Random random = new Random();

        // Remplir le tableau avec des nombres entiers aléatoires
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); // Générer un nombre entre 0 et 99
        }

        // Afficher les valeurs du tableau dans le terminal
        System.out.print("Valeurs du tableau : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(); // Pour une nouvelle ligne
    }
}

