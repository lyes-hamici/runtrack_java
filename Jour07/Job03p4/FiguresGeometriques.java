package Jour07.Job03p4;

public class FiguresGeometriques {

    public static class Figure {
        protected double x;
        protected double y;

        public Figure(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void affiche() {
            System.out.println("Centre de la figure: (" + x + ", " + y + ")");
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }
    }

    public static class Rectangle extends Figure {
        private double largeur;
        private double longueur;

        public Rectangle(double x, double y, double largeur, double longueur) {
            super(x, y); 
            this.largeur = largeur;
            this.longueur = longueur;
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }

        public double surface() {
            return largeur * longueur;
        }
    }

    public static class Cercle extends Figure {
        private double rayon;

        public Cercle(double x, double y, double rayon) {
            super(x, y); 
            this.rayon = rayon;
        }

        public double getRayon() {
            return rayon;
        }

        public void setRayon(double rayon) {
            this.rayon = rayon;
        }

        public double surface() {
            return Math.PI * rayon * rayon;
        }

        public boolean estInterieur(double pointX, double pointY) {
            double distance = Math.sqrt(Math.pow((pointX - x), 2) + Math.pow((pointY - y), 2));
            return distance <= rayon;
        }
    }

    public static class RectangleColore extends Rectangle {
        private int couleur;

        public RectangleColore(double x, double y, double largeur, double longueur, int couleur) {
            super(x, y, largeur, longueur); 
            this.couleur = couleur;
        }

        public int getCouleur() {
            return couleur;
        }

        public void setCouleur(int couleur) {
            this.couleur = couleur;
        }
    }

    public static void main(String[] args) {
        // Test de la classe Rectangle
        Rectangle rect = new Rectangle(0.0, 0.0, 5.0, 10.0);
        rect.affiche();
        System.out.println("Largeur du rectangle: " + rect.getLargeur());
        System.out.println("Longueur du rectangle: " + rect.getLongueur());
        System.out.println("Surface du rectangle: " + rect.surface());

        rect.setLargeur(7.0);
        rect.setLongueur(12.0);
        System.out.println("Nouvelle largeur du rectangle: " + rect.getLargeur());
        System.out.println("Nouvelle longueur du rectangle: " + rect.getLongueur());
        System.out.println("Nouvelle surface du rectangle: " + rect.surface());

        // Test de la classe Cercle
        Cercle cercle = new Cercle(0.0, 0.0, 5.0);
        cercle.affiche();
        System.out.println("Rayon du cercle: " + cercle.getRayon());
        System.out.println("Surface du cercle: " + cercle.surface());

        double pointX = 3.0;
        double pointY = 4.0;
        System.out.println("Le point (" + pointX + ", " + pointY + ") est à l'intérieur du cercle: " + cercle.estInterieur(pointX, pointY));

        pointX = 6.0;
        pointY = 6.0;
        System.out.println("Le point (" + pointX + ", " + pointY + ") est à l'intérieur du cercle: " + cercle.estInterieur(pointX, pointY));

        RectangleColore rectColore = new RectangleColore(0.0, 0.0, 4.0, 8.0, 0xFF0000); // Rouge
        rectColore.affiche();
        System.out.println("Largeur du rectangle coloré: " + rectColore.getLargeur());
        System.out.println("Longueur du rectangle coloré: " + rectColore.getLongueur());
        System.out.println("Couleur du rectangle coloré: " + Integer.toHexString(rectColore.getCouleur()));
        System.out.println("Surface du rectangle coloré: " + rectColore.surface());

        rectColore.setCouleur(0x00FF00); 
        System.out.println("Nouvelle couleur du rectangle coloré: " + Integer.toHexString(rectColore.getCouleur()));
    }
}
