package subiectB.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    List<Notificabil> clienti;

    public Observabil() {
        clienti = new ArrayList<>();
    }

    void abonareObservabil(Notificabil notificabil){
        clienti.add(notificabil);
    }
    void dezabonareObservabil(Notificabil notificabil){
        clienti.remove(notificabil);
    }

    void notificareClienti(){
        for(Notificabil notificabil: clienti){
            notificabil.notificare();
        }
    }

    public abstract void notificareMeniuNou();
    public abstract void notificarePretNou();
}
