package Jour01.Job09;


public class MyString {
    public static void main(String[] args) {
        // 1. Déclaration et initialisation avec une chaîne de caractères littérale
        String str1 = "Hello, World!";

        // 2. Déclaration d'une variable String et initialisation avec le constructeur de la classe String
        String str2 = new String("Java Programming");

        // 3. Déclaration d'une variable String et initialisation avec une autre variable String
        String str3 = str1;

        // 4. Déclaration d'une variable String et initialisation avec une méthode retournant une chaîne de caractères
        String str4 = "This is a string".substring(0, 4);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
    }
}