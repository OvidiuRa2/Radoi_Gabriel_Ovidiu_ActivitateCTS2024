package subiectD.builder;

public class Cont {
    private String numeCont;
    private String tipCont;
    private boolean contSalariu;
    private  boolean cardAtasat;
    private boolean internetBanking;

    public Cont(String numeCont, String tipCont, boolean contSalariu, boolean cardAtasat, boolean internetBanking) {
        this.numeCont = numeCont;
        this.tipCont = tipCont;
        this.contSalariu = contSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    public String getNumeCont() {
        return numeCont;
    }

    public void setNumeCont(String numeCont) {
        this.numeCont = numeCont;
    }

    public String getTipCont() {
        return tipCont;
    }

    public void setTipCont(String tipCont) {
        this.tipCont = tipCont;
    }

    public boolean isContSalariu() {
        return contSalariu;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numeCont='").append(numeCont).append('\'');
        sb.append(", tipCont='").append(tipCont).append('\'');
        sb.append(", contSalariu=").append(contSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
