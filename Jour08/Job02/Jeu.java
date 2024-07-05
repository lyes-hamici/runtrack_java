package jour08.job02;

import java.util.ArrayList;

public class Jeu {
    private ArrayList<Carte> cartes;

    public Jeu() {
        cartes = new ArrayList<>();
    }

    public void piocher(Carte carte) {
        if (cartes.size() < 10) {
            cartes.add(carte);
        } else {
            System.out.println("Le jeu contient déjà 10 cartes.");
        }
    }

    public void jouer() {
        if (!cartes.isEmpty()) {
            Carte carte = cartes.remove(0);
            if (carte != null) {
                carte.afficher();
            }
        } else {
            System.out.println("Il n'y a pas de carte à jouer.");
        }
    }

    public void afficher() {
        for (Carte carte : cartes) {
            if (carte != null) {
                carte.afficher();
                System.out.println();
            }
        }
    }
}
