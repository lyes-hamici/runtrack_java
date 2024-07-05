package jour08.job03;

public class Forme {
    private String couleur;

    public Forme(String unecouleur) {
        this.couleur = unecouleur;
    }

    public Forme(Forme other) {
        this.couleur = other.couleur;
    }

    public void dessine() {
        System.out.println("Une forme " + this.couleur);
    }
}
