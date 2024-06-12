package Jour03.Job05;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Créer un tableau avec des valeurs
        int[] valeurs = {3, 7, 3, 9, 8, 7, 3};

        // Utiliser un HashSet pour stocker les valeurs uniques
        Set<Integer> valeursUniques = new HashSet<>();

        // Parcourir le tableau et ajouter chaque valeur au HashSet
        for (int valeur : valeurs) {
            valeursUniques.add(valeur);
        }

        // Afficher les valeurs uniques
        System.out.println("Valeurs uniques du tableau :");
        for (int valeur : valeursUniques) {
            System.out.println(valeur);
        }
    }
}

