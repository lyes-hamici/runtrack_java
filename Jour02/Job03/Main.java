package Jour02.Job03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre : ");
        int nombre = scanner.nextInt();
        for(int i=0; i<11; ++i){
            result = i * nombre;
            System.out.println(i + " x " + nombre + " = " + result);
        }

        scanner.close();
    
}
}