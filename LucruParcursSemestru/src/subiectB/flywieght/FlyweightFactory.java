package subiectB.flywieght;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,CreareRezervare> clienti;

    public FlyweightFactory() {
        clienti = new HashMap<>();
    }
    public CreareRezervare getClient(String nume,String nrTelefon){
        if(!clienti.containsKey(nume)){
            clienti.put(nume, new Client(nume,nrTelefon));
        }

        return  clienti.get(nume);
    }
}
