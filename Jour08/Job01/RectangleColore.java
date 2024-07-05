package Jour08.Job01;

public class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncouleur = " + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        RectangleColore that = (RectangleColore) obj;
        return couleur != null ? couleur.equals(that.couleur) : that.couleur == null;
    }
}