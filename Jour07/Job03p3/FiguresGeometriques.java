package Jour07.Job03p3;

public class FiguresGeometriques {
    public static void main(String[] args) {
        // Create a new rectangle object
        Rectangle rect = new Rectangle(5.0, 10.0);
        
        // Print the properties of the rectangle
        System.out.println("Largeur: " + rect.getLargeur());
        System.out.println("Longueur: " + rect.getLongueur());
        
        // Print the surface of the rectangle
        System.out.println("Surface: " + rect.surface());
        
        // Set new dimensions
        rect.setLargeur(7.0);
        rect.setLongueur(14.0);
        
        // Print the updated properties of the rectangle
        System.out.println("Updated Largeur: " + rect.getLargeur());
        System.out.println("Updated Longueur: " + rect.getLongueur());
        
        // Print the updated surface of the rectangle
        System.out.println("Updated Surface: " + rect.surface());

        // Create a new colored rectangle object
        RectangleColore rectColore = new RectangleColore(5.0, 10.0, 255);
        
        // Print the properties of the colored rectangle
        System.out.println("Largeur: " + rectColore.getLargeur());
        System.out.println("Longueur: " + rectColore.getLongueur());
        System.out.println("Couleur: " + rectColore.getCouleur());
        
        // Print the surface of the colored rectangle
        System.out.println("Surface: " + rectColore.surface());
    }
}

class Rectangle {
    // Attributes (protected)
    protected double largeur;
    protected double longueur;
    
    // Constructor
    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }
    
    // Getters
    public double getLargeur() {
        return largeur;
    }
    
    public double getLongueur() {
        return longueur;
    }
    
    // Setters
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    
    // Method to calculate the surface
    public double surface() {
        return largeur * longueur;
    }
}

class RectangleColore extends Rectangle {
    // Additional attribute
    private int couleur;
    
    // Constructor
    public RectangleColore(double largeur, double longueur, int couleur) {
        super(largeur, longueur);
        this.couleur = couleur;
    }
    
    // Getter for couleur
    public int getCouleur() {
        return couleur;
    }
    
    // Setter for couleur
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}

