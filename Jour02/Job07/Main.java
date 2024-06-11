package Jour02.Job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int nombre = scanner.nextInt();
        for(int i=0; i<nombre; ++i){
            result = i * nombre; 
        }
        System.out.println("la factorielle de " + nombre + " = "+result);

        scanner.close();
    }
}
