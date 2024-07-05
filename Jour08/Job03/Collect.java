package jour08.job03;

public class Collect {
    private Forme collect[];
    private int index;

    public Collect(int indexMax) {
        this.collect = new Forme[indexMax];
        this.index = -1;
    }

    public void add(Forme a){
        if (this.index < this.collect.length - 1) {
            ++ this.index;
            this.collect[this.index] = a;
        }
    }

    public void dessine() {
        for(int i = 0; i <= this.index; ++i) {
            this.collect[i].dessine();
        }
    }
}
