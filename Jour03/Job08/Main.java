package Jour03.Job08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Déclarer la matrice "tableau"
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        // Afficher la matrice initiale
        System.out.println("Matrice initiale :");
        afficherMatrice(tableau);

        // Aplatir la matrice en un tableau unidimensionnel
        int[] array = new int[tableau.length * tableau[0].length];
        int index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                array[index++] = tableau[i][j];
            }
        }

        // Trier le tableau unidimensionnel
        Arrays.sort(array);

        // Reconstruire la matrice triée
        index = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = array[index++];
            }
        }

        // Afficher la matrice triée
        System.out.println("Matrice triée :");
        afficherMatrice(tableau);
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}

