package subiectD.builder;

public class ContBuilder implements Builder {
    private boolean contSalariu;
    private  boolean cardAtasat;
    private boolean internetBanking;
    private String numeCont;
    private String tipCont;

    @Override
    public Cont build() {
        return new Cont(numeCont,tipCont, contSalariu,cardAtasat,internetBanking);
    }

    public ContBuilder(String numeCont, String tipCont) {
        this.numeCont = numeCont;
        this.tipCont = tipCont;
    }

    @Override
    public Builder adaugaContSalariu() {
        contSalariu = true;
        return this;
    }

    @Override
    public Builder adaugaCardAtasat() {
        cardAtasat = true;
        return this;
    }

    @Override
    public Builder adaugaInternetBanking() {
        internetBanking = true;
        return this;
    }
}
