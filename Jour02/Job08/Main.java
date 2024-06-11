package Jour02.Job08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Veuillez saisir un nombre: ");
        String numero = scanner.nextLine(); 

        
        int nombreDeChiffres = numero.length();

      
        System.out.println("Le nombre de chiffres dans le nombre saisi est: " + nombreDeChiffres);

       
        scanner.close();
    }
}
