package jour08.job02;

public class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0); // The cost of a terrain is always 0
        this.couleur = couleur;
    }

    public char getCouleur() {
        return couleur;
    }

    @Override
    public void afficher() {
        System.out.println("Terrain:");
        System.out.println("Coût: " + getCout());
        System.out.println("Couleur: " + couleur);
    }
}
