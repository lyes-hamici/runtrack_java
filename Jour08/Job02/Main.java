package jour08.job02;

public class Main {
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        
        Terrain terrain1 = new Terrain('B');
        Creature creature1 = new Creature("Dragon", 10, 10, 5);
        Sortilege sortilege1 = new Sortilege("Fireball", "Deals 5 damage", 3);
        
        jeu.piocher(terrain1);
        jeu.piocher(creature1);
        jeu.piocher(sortilege1);
        
        System.out.println("Affichage du jeu:");
        jeu.afficher();
        
        System.out.println("\nJouer une carte:");
        jeu.jouer();
        
        System.out.println("\nAffichage du jeu après avoir joué une carte:");
        jeu.afficher();
    }
}
