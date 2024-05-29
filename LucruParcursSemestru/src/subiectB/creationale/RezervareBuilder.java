package subiectB.creationale;

public class RezervareBuilder implements Builder{
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean decorareaMesei;
    @Override
    public Builder adaugaAsezareGeam() {
        asezareGeam = true;
        return this;
    }

    @Override
    public Builder adaugaScaunErgonomic() {
        scaunErgonomic = true;
        return this;
    }

    @Override
    public Builder adaugaDecorareaMesei() {
        decorareaMesei = true;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(asezareGeam,scaunErgonomic,decorareaMesei);
    }
}
