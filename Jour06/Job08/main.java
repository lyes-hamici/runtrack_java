public class Main {
    public static void main(String[] args) {
        // Déclaration de la variable pour stocker la somme
        int somme = 0;

        // Calcul de la somme des 100 premiers entiers
        for (int i = 1; i <= 100; i++) {
            somme += i;
        }

        // Affichage de la somme
        System.out.println("La somme des 100 premiers entiers est : " + somme);
    }
}
