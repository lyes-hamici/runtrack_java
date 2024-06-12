package Jour03.Job03;

public class Main {
    public static void main(String[] args) {
        // Créer un tableau de chaînes de caractères avec les noms donnés
        String[] noms = {"Josette", "John", "Myrtille", "Marc"};

        // Afficher la valeur "John" dans le terminal
        System.out.println("Valeur à l'index 1 : " + noms[1]);

        // Changer la valeur "Myrtille" par "Mireille"
        noms[2] = "Mireille";

        // Afficher toutes les valeurs du tableau dans le terminal
        System.out.print("Valeurs du tableau : ");
        for (int i = 0; i < noms.length; i++) {
            System.out.print(noms[i] + " ");
        }
        System.out.println(); // Pour une nouvelle ligne
    }
}

