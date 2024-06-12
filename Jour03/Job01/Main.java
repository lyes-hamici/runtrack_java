package Jour03.Job01;

public class Main {
    public static void main(String[] args) {
        // Déclarer un tableau de cinq éléments de type int
        int[] tableau = new int[5];

        // Assigner les valeurs aux indices spécifiés
        tableau[0] = 10; // Valeur 10 à l'index 0
        tableau[2] = 2;  // Valeur 2 à l'index 2
        tableau[4] = 69; // Valeur 69 à l'index 4

        // Afficher le tableau dans le terminal
        System.out.print("Tableau: ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(); // Pour une nouvelle ligne

        // Afficher la valeur de l'index 1
        System.out.println("Valeur à l'index 1: " + tableau[1]);
    }
}
