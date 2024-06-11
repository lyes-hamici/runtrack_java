package Jour02.Job09;

public class Main {
    public static void main(String[] args) {
        int numero = 1234;
        
        // Récupérer le dernier chiffre
        int dernierChiffre = numero % 10;

        // Récupérer le premier chiffre
        int premierChiffre = numero;
        while (premierChiffre >= 10) {
            premierChiffre /= 10;
        }

        // Afficher le résultat
        System.out.println("Le premier chiffre est: " + premierChiffre);
        System.out.println("Le dernier chiffre est: " + dernierChiffre);
    } 
    }

