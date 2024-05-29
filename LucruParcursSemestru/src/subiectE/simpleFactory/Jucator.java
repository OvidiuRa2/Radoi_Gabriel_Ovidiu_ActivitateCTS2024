package subiectE.simpleFactory;

public abstract class Jucator {

    private String nume;
    private int nr;

    public Jucator(String nume, int nr) {
        this.nume = nume;
        this.nr = nr;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
