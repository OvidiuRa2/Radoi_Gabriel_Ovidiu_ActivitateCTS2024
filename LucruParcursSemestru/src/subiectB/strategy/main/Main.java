package subiectB.strategy.main;

import subiectB.strategy.clase.Client;
import subiectB.strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client =  new Client();
        client.plateste(150);

        client.setPlata(new PlataCash());
        client.plateste(100);
    }
}
