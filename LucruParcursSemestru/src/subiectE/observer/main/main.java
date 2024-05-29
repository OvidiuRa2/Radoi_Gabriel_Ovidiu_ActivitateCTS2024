package subiectE.observer.main;

import subiectE.observer.ClientFidel;
import subiectE.observer.Observabil;
import subiectE.observer.SalaSport;

public class main {
    public static void main(String[] args) {

        Observabil salaSport = new SalaSport();
        salaSport.abonareObserver(new ClientFidel());
        salaSport.abonareObserver(new ClientFidel());
        salaSport.abonareObserver(new ClientFidel());
        salaSport.nouMeciFotbal();
        salaSport.nouMeciVolei();
    }
}
