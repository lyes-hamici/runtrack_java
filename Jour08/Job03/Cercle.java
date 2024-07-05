package jour08.job03;

public class Cercle extends Forme{
    
    public Cercle(String couleur) {
        super(couleur);
    }

    public Cercle(Cercle other) {
        super(other);
    }

    public void dessine(){
        super.dessine();
        System.out.println("Toute ronde");
    }
}
