package subiectA.builder.clase;

public class ConcreteBuilder implements Builder{
    private String nume;
    private boolean arePapuci;
    private  boolean arePatRabatabil;

    public ConcreteBuilder(String nume) {
        this.arePapuci = false;
        this.arePatRabatabil = false;
        this.nume = nume;
    }

    @Override
    public Builder adaugaPapuci() {
        arePapuci = true;
        return this;
    }

    @Override
    public Builder adaugaPat() {
        arePatRabatabil = true;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume,arePapuci,arePatRabatabil);
    }
}
