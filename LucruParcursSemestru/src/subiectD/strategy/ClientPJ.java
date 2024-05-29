package subiectD.strategy;

public class ClientPJ extends Client{
    private String acte;
    private String inregistrare;

    public ClientPJ(String nume, String acte, String inregistrare) {
        super(nume);
        this.acte = acte;
        this.inregistrare = inregistrare;
    }

    public String getActe() {
        return acte;
    }

    public String getInregistrare() {
        return inregistrare;
    }
}
