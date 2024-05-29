package subiectB.observer;

public class Client implements Notificabil{

    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare() {
        System.out.println("Clientul cu numele " + nume + " a primit mesajul");
    }
}
