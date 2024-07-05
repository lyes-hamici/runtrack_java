package jour08.job02;

public abstract class Carte {
    protected int cout;

    public Carte(int cout) {
        this.cout = cout;
        System.out.println(this.getClass().getSimpleName());
    }

    public int getCout() {
        return cout;
    }

    public abstract void afficher();
}
