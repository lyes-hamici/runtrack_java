package Jour07.Job03p1;

public class FiguresGeometriques {
    public static void main(String[] args) {
        // Create a new circle object
        Cercle circle = new Cercle(5.0, 5.0, 10.0);
        
        // Print the properties of the circle
        System.out.println("Centre X: " + circle.getX());
        System.out.println("Centre Y: " + circle.getY());
        System.out.println("Rayon: " + circle.getRayon());
        
        // Print the surface of the circle
        System.out.println("Surface: " + circle.surface());
        
        // Set new dimensions
        circle.setCentre(7.0, 7.0);
        circle.setRayon(14.0);
        
        // Print the updated properties of the circle
        System.out.println("Updated Centre X: " + circle.getX());
        System.out.println("Updated Centre Y: " + circle.getY());
        System.out.println("Updated Rayon: " + circle.getRayon());
        
        // Print the updated surface of the circle
        System.out.println("Updated Surface: " + circle.surface());
        
        // Check if a point is inside the circle
        System.out.println("Point (10, 10) is inside the circle: " + circle.estInterieur(10, 10));
        System.out.println("Point (20, 20) is inside the circle: " + circle.estInterieur(20, 20));
    }
}

class Cercle {
    // Attributes (protected)
    protected double x;
    protected double y;
    protected double rayon;
    
    // Constructor
    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }
    
    // Getters
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getRayon() {
        return rayon;
    }
    
    // Setters
    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    
    // Method to calculate the surface
    public double surface() {
        return Math.PI * rayon * rayon;
    }
    
    // Method to check if a point is inside the circle
    public boolean estInterieur(double px, double py) {
        double distance = Math.sqrt((px - x) * (px - x) + (py - y) * (py - y));
        return distance <= rayon;
    }
}
