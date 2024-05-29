package subiectA.facade;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    List<Integer> paturiLibere;

    public Salon() {

        paturiLibere = new ArrayList<>();
        paturiLibere.add(1);
        paturiLibere.add(2);
        paturiLibere.add(3);
    }

    public List<Integer> getPaturiLibere() {
        return paturiLibere;
    }
}
