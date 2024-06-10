package Jour01.Job06;

public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 , num2 , temp ;
        num1 = 2;
        num2 = 5;
        System.out.println("Valeur avant changement num1 " + num1 + ", num2 " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Valeur après changement num1 " + num1 + ", num2 " + num2);
    }
}
