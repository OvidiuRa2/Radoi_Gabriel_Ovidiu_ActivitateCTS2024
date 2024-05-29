package subiectE.proxy;

public class CLient {
    private String nume;
    private int varsta;

    public CLient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
