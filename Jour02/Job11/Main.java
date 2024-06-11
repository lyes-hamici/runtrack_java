package Jour02.Job11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Veuillez saisir la hauteur du triangle: ");
        int hauteur = scanner.nextInt();

     
        for (int i = 1; i <= hauteur; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        
        scanner.close();
    }
}

