package Jour01.Job14;

public class Main {
    public static void main(String[] args) {
        int number1 = 5, number2 = 10;
        Somme somme = new Somme(number1, number2);
        System.out.println("La somme de " + number1 + " et " + number2 + " est " + somme.calculerSomme());
    }
}