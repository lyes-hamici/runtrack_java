package Jour01.Job08;

public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;
        double tva = 1.2;

        double tarifHT = prix * quantite;
        double tarifTTC = tarifHT * tva;

        System.out.println("Le prix hors taxe est de " + tarifHT + " euros.");
        System.out.println("Le prix total est de " + tarifTTC + " euros.");
    }
}