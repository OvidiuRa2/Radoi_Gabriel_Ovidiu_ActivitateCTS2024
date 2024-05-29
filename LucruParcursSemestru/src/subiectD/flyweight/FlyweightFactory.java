package subiectD.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,DetinatorCont> detinatorContMap;

    public FlyweightFactory() {
        detinatorContMap = new HashMap<>();
    }

    Flyweight getDetinatorCont(String nume,String adresa,InfoBanca infoBanca){
        if(!detinatorContMap.containsKey(nume)){
            detinatorContMap.put(nume,new DetinatorCont(nume,adresa,infoBanca));
        }

        return detinatorContMap.get(nume);
    }
}
