package subiectE.observer;

public class SalaSport extends Observabil{
    @Override
    public void nouMeciFotbal() {
        notificareObserveri("Un nou meci de fotbal");
    }

    @Override
    public void nouMeciVolei() {
        notificareObserveri("Un nou meci de volei");
    }
}
