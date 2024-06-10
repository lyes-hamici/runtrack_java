package Jour01.Job12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir la première chaîne de caractères : ");
        String chaine1 = scanner.nextLine();
        System.out.print("Veuillez saisir la deuxième chaîne de caractères : ");
        String chaine2 = scanner.nextLine();

        System.out.println("Avant l'échange :");
        System.out.println("chaine1: " + chaine1);
        System.out.println("chaine2: " + chaine2);

        chaine1 = chaine1 + chaine2; 
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length()); 
        chaine1 = chaine1.substring(chaine2.length()); 

        System.out.println("Après l'échange :");
        System.out.println("chaine1: " + chaine1);
        System.out.println("chaine2: " + chaine2);

        scanner.close();
    }
}
