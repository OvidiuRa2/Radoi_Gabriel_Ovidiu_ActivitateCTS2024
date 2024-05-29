package subiectD.observer;

public class Client implements Notificabil{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println("Mesaj primit: " + mesaj);
    }
}
