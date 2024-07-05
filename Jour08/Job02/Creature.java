package jour08.job02;

public class Creature extends Carte {
    private String nom;
    private int pointsDegats;
    private int pointsVie;

    public Creature(String nom, int pointsDegats, int pointsVie, int cout) {
        super(cout);
        this.nom = nom;
        this.pointsDegats = pointsDegats;
        this.pointsVie = pointsVie;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDegats() {
        return pointsDegats;
    }

    public int getPointsVie() {
        return pointsVie;
    }

    @Override
    public void afficher() {
        System.out.println("Créature:");
        System.out.println("Coût: " + getCout());
        System.out.println("Nom: " + nom);
        System.out.println("Points de Dégâts: " + pointsDegats);
        System.out.println("Points de Vie: " + pointsVie);
    }
}
