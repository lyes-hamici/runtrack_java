public class Main {
    public static void main(String[] args) {
        // Calcul de la factorielle de 8
        int nombre = 8;
        long factorielle = 1;

        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }

        // Affichage du résultat
        System.out.println("La factorielle de " + nombre + " est : " + factorielle);
    }
}
