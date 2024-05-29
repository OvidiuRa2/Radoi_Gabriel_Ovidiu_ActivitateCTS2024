package subiectD.strategy;

public abstract class Client {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
