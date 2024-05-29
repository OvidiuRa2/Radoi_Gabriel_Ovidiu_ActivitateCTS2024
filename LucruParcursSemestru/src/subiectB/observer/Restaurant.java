package subiectB.observer;

public class Restaurant extends Observabil{
    @Override
    public void notificareMeniuNou() {
        System.out.println("Meniu nou");
        super.notificareClienti();
    }

    @Override
    public void notificarePretNou() {
        System.out.println("Pret nou");
        super.notificareClienti();
    }
}
