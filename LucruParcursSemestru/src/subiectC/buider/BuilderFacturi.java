package subiectC.buider;

public class BuilderFacturi implements Builder {
    private int nrPungi;
    private boolean plataCard;
    private boolean cardFidelitate;
    private int cotaTva;

    protected BuilderFacturi() {
        nrPungi = 0;
        cotaTva = 0;
    }

    @Override
    public Factura build() {
        return new Factura(nrPungi, plataCard, cardFidelitate, cotaTva);
    }

    @Override
    public Builder adaugaNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
        return this;
    }

    @Override
    public Builder adaugaPlataCard() {
        plataCard = true;
        return this;
    }

    @Override
    public Builder adaugaCardFidelitate() {
        cardFidelitate = true;
        return this;
    }

    @Override
    public Builder adaugaCotaTva(int cota) {
        cotaTva = cota;
        return this;
    }
}
