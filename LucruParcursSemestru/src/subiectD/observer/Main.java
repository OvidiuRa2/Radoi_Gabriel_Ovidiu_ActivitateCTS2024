package subiectD.observer;

public class Main {
    public static void main(String[] args) {
        Observabil banca = new Banca();
        banca.abonareNotificabil(new Client("Andrei"));
        banca.abonareNotificabil(new Client("Andrei"));
        Client client =new Client("Andrei");
        banca.abonareNotificabil(client);
        banca.dezabonareNotificabil(client);
        banca.ofertaNoua();
    }
}
