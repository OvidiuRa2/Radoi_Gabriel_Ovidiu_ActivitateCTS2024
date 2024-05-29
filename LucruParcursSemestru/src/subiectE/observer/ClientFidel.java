package subiectE.observer;

public class ClientFidel implements Observer {
    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul fidel a primit mesajul: " + mesaj);
    }
}
