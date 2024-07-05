package jour08.job03;

public class Triangle extends Forme{
    
    public Triangle(String couleur) {
        super(couleur);
    }

    public Triangle(Triangle other) {
        super(other);
    }

    public void dessine(){
        super.dessine();
        System.out.println("Toute pointue");
    }
}
