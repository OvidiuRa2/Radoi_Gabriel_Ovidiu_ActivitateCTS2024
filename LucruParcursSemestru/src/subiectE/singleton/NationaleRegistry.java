package subiectE.singleton;

import java.util.HashMap;
import java.util.Map;

public class NationaleRegistry {
    private Map<String, NationalaFotbal> nationalaFotbalMap;
    private static NationaleRegistry nationaleRegistry = null;

    private NationaleRegistry() {
        nationalaFotbalMap = new HashMap<>();
    }

    public synchronized static NationaleRegistry getInstance() {
        if (nationaleRegistry == null) {
            nationaleRegistry = new NationaleRegistry();
        }

        return nationaleRegistry;
    }

    public void adaugaNationala(int nrJucatori, String numeEchipa){
        if(!nationalaFotbalMap.containsKey(numeEchipa)){
            nationalaFotbalMap.put(numeEchipa,new NationalaFotbal(nrJucatori, numeEchipa));
        }
    }

    public  NationalaFotbal getNationalaFotbalMap(String numeEchipa) {
        return nationalaFotbalMap.get(numeEchipa);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NationaleRegistry{");
        sb.append("nationalaFotbalMap=").append(nationalaFotbalMap);
        sb.append('}');
        return sb.toString();
    }
}
