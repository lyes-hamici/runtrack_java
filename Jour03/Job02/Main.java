package Jour03.Job02;

public class Main {
    public static void main(String[] args) {
        // Créer un tableau nommé "monTableau" avec les valeurs initiales
        int[] monTableau = {12, 6, 76, 89};

        // Afficher les valeurs initiales du tableau dans le terminal
        System.out.print("Valeurs initiales de monTableau: ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");
        }
        System.out.println(); // Pour une nouvelle ligne

        // Assigner d'autres valeurs à votre tableau
        monTableau[0] = 45; // Nouvelle valeur pour l'index 0
        monTableau[1] = 23; // Nouvelle valeur pour l'index 1
        monTableau[2] = 89; // Nouvelle valeur pour l'index 2
        monTableau[3] = 12; // Nouvelle valeur pour l'index 3

        // Afficher à nouveau les valeurs du tableau après modification
        System.out.print("Valeurs modifiées de monTableau: ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");
        }
        System.out.println(); // Pour une nouvelle ligne
    }
}

