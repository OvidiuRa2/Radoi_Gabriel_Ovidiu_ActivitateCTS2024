package subiectE.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersoanaFactory {
    Map<String, Flywieght> persoane;

    public PersoanaFactory() {
        persoane = new HashMap<>();
    }

    public Flywieght getPersoana(String cod, int inaltime, int latime){
        if(!persoane.containsKey(cod)){
            persoane.put(cod,new Persoana(cod,inaltime,latime));
        }
        return persoane.get(cod);
    }
}
