package subiectE.builder;

public class Rezervare {
    private int nrRezervare;
    private  boolean mancareInclusa;
    private boolean scaunErgonomic;

    protected Rezervare(int nrRezervare, boolean mancareInclusa, boolean scaunErgonomic) {
        this.nrRezervare = nrRezervare;
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
    }

    public int getNrRezervare() {
        return nrRezervare;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append('}');
        return sb.toString();
    }
}
