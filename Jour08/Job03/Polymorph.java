package jour08.job03;

public class Polymorph {
    public static void main(String[] args) {
        Forme[] tabforme = {new Cercle("rouge"), new Triangle("jaune")};

        Collect formes =  new Collect(10);

        for(int i = 0; i < tabforme.length; ++i) {
            formes.add(tabforme[i]);
        }
        formes.dessine();
    }
}
