package subiectA.builder.clase;

public class Pacient {
    private String nume;
    private boolean arePapuci;
    private  boolean arePatRabatabil;

    protected Pacient(String nume, boolean arePapuci, boolean arePatRabatabil) {
        this.nume = nume;
        this.arePapuci = arePapuci;
        this.arePatRabatabil = arePatRabatabil;
    }

    public boolean isArePapuci() {
        return arePapuci;
    }

    public boolean isArePatRabatabil() {
        return arePatRabatabil;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append('}');
        return sb.toString();
    }
}
