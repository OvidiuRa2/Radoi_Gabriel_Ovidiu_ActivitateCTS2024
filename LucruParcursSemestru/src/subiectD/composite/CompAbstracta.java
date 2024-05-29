package subiectD.composite;

public abstract class CompAbstracta {
    private String denumire;

    public CompAbstracta(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    abstract void printare();
    abstract void adaugaNod(CompAbstracta nod);
    abstract void stergeNod(CompAbstracta nod);
    abstract CompAbstracta getNod(int index);
}
