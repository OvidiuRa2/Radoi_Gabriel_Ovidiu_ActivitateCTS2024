package subiectE.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observer> observeri;

    public Observabil() {
        observeri = new ArrayList<>();
    }

    public void abonareObserver(Observer observer){
        observeri.add(observer);
    }
    public void dezabonareObserver(Observer observer){
        observeri.remove(observer);
    }
    protected void notificareObserveri(String mesaj){
        for (Observer observer:observeri){
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract  void nouMeciFotbal();
    public abstract  void nouMeciVolei();
}
