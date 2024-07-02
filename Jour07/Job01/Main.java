package Jour07.Job01;

class Toto {

    // Définir toto comme une variable statique pour un comptage global
    static int toto = 0;

    // Constructeur
    Toto() {
        toto = toto + 1;
    }
}

public class Main {
    public static void main(String[] args) {

        // Création de deux instances de la classe Toto
        Toto t1 = new Toto();
        Toto t2 = new Toto();

        // Affichage de la valeur de toto
        System.out.println("Toto: " + Toto.toto);
    }
}
