package subiectB.creationale;

public abstract class Supa {
    private String denumire;
    private float pret;

    public Supa(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void descriere();

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }
}
