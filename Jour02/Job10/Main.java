package Jour02.Job10;

public class Main {
    public static void main(String[] args) {
        int numero = 1234;
        int somme = 0;

        // Additionner tous les chiffres du nombre
        while (numero != 0) {
            int chiffre = numero % 10;  // Obtenir le dernier chiffre
            somme += chiffre;           // Ajouter le dernier chiffre à la somme
            numero /= 10;               // Supprimer le dernier chiffre
        }

        // Afficher le résultat
        System.out.println("La somme des chiffres est : " + somme);
    }
}
