package Jour08.Job01;

public class Rectangle {
    protected double largeur;
    protected double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle :\nlargeur = " + largeur + "\nhauteur = " + hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.largeur, largeur) == 0 &&
                Double.compare(rectangle.hauteur, hauteur) == 0;
    }
}
