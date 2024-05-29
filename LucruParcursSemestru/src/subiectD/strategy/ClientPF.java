package subiectD.strategy;

public class ClientPF extends Client{
    private String buletin;
    private String adeverinta;

    public ClientPF(String nume,String buletin, String adeverinta) {
        super(nume);
        this.buletin = buletin;
        this.adeverinta = adeverinta;
    }

    public String getBuletin() {
        return buletin;
    }

    public String getAdeverinta() {
        return adeverinta;
    }
}
