public class Main {
    public static void main(String[] args) {
        // Création d'un tableau de 10 entiers
        int[] T = new int[10];

        // Stockage des entiers de 0 à 9 dans le tableau
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }

        // Affichage des valeurs de certaines positions du tableau
        System.out.println("Valeur de T[0] : " + T[0]);
        System.out.println("Valeur de T[1] : " + T[1]);
        System.out.println("Valeur de T[5] : " + T[5]);
        System.out.println("Valeur de T[9] : " + T[9]);

        // T[10] n'existe pas, essayons de l'afficher
        try {
            System.out.println("Valeur de T[10] : " + T[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("T[10] n'existe pas : " + e.getMessage());
        }
    }
}

