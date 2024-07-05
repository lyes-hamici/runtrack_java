package jour08.job02;

public class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(String nom, String explication, int cout) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
    }

    public String getNom() {
        return nom;
    }

    public String getExplication() {
        return explication;
    }

    @Override
    public void afficher() {
        System.out.println("Sortilège:");
        System.out.println("Coût: " + getCout());
        System.out.println("Nom: " + nom);
        System.out.println("Explication: " + explication);
    }
}
