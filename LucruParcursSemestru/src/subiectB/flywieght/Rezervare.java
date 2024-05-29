package subiectB.flywieght;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;

    public Rezervare(int nrMasa, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
