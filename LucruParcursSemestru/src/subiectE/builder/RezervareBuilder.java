package subiectE.builder;

public class RezervareBuilder implements Builder {

    private int nrRezervare;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;

    public RezervareBuilder() {
        nrRezervare = 1;
        mancareInclusa = false;
        scaunErgonomic = false;
    }

    public RezervareBuilder(int nrRezervare) {
        this.nrRezervare = nrRezervare;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(nrRezervare, mancareInclusa, scaunErgonomic);
    }

    @Override
    public Builder adaugaScaun() {
        scaunErgonomic = true;
        return this;
    }

    @Override
    public Builder adaugaMancare() {
        mancareInclusa = true;
        return this;
    }
}
