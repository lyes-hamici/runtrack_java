package Jour03.Job04;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Créer un tableau avec les valeurs données
        int[] valeurs = {3, 7, 3, 9, 8};

        // Utiliser une HashMap pour compter les occurrences de chaque nombre
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Parcourir le tableau et compter les occurrences
        for (int valeur : valeurs) {
            if (occurrences.containsKey(valeur)) {
                occurrences.put(valeur, occurrences.get(valeur) + 1);
            } else {
                occurrences.put(valeur, 1);
            }
        }

        // Afficher le résultat dans le terminal
        System.out.println("Nombre d'occurrences de chaque nombre :");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Nombre " + entry.getKey() + ": " + entry.getValue() + " occurrence(s)");
        }
    }
}
