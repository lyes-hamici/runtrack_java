package Jour07.Job03p0;

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


