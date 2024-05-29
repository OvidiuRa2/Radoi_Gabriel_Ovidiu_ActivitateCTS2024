package subiectD.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Notificabil> notificabili;

    public Observabil() {
        this.notificabili = new ArrayList<>();
    }

    void abonareNotificabil(Notificabil notificabil){
        notificabili.add(notificabil);
    }

    void dezabonareNotificabil(Notificabil notificabil){
        notificabili.remove(notificabil);
    }

    protected void notificareObservatori(String mesaj){
        for (Notificabil notificabil:notificabili){
            notificabil.notifica(mesaj);
        }
    }

    public abstract  void ofertaNoua();
}
