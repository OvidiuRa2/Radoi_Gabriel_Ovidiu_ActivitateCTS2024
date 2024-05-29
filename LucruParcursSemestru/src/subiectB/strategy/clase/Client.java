package subiectB.strategy.clase;

public class Client {
    private Plata plata;

    public Client() {
        plata = new PlataCard();
    }

    public void setPlata(Plata plata) {
        this.plata = plata;
    }

    public void plateste(double suma){
        plata.plateste(suma);
    }
}
