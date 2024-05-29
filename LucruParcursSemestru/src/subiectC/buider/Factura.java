package subiectC.buider;

public class Factura {
    private int nrPungi;
    private boolean plataCard;
    private boolean cardFidelitate;
    private int cotaTva;

    public Factura(int nrPungi, boolean plataCard, boolean cardFidelitate, int cotaTva) {
        this.nrPungi = nrPungi;
        this.plataCard = plataCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTva = cotaTva;
    }

    public int getNrPungi() {
        return nrPungi;
    }

    public void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

    public boolean isPlataCard() {
        return plataCard;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public int getCotaTva() {
        return cotaTva;
    }

    public void setCotaTva(int cotaTva) {
        this.cotaTva = cotaTva;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("nrPungi=").append(nrPungi);
        sb.append(", plataCard=").append(plataCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTva=").append(cotaTva);
        sb.append('}');
        return sb.toString();
    }
}
