package subiectD.observer;

public class Banca extends Observabil{

    @Override
    public void ofertaNoua() {
        notificareObservatori("S a lansat o noua oferta");
    }
}
