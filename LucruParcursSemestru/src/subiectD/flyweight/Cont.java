package subiectD.flyweight;

public class Cont {
    private String nrCont;
    private double suma;

    public Cont(String nrCont, double suma) {
        this.nrCont = nrCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("nrCont='").append(nrCont).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
