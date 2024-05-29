package subiectD.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends CompAbstracta{

    private List<CompAbstracta> noduri;

    public Composite(String denumire) {
        super(denumire);
        noduri = new ArrayList<>();
    }

    @Override
    void printare() {
        System.out.println("Categoria cu numele " +getDenumire());
        for(CompAbstracta nod: noduri){
            nod.printare();
        }
    }

    @Override
    void adaugaNod(CompAbstracta nod) {
        noduri.add(nod);
    }

    @Override
    void stergeNod(CompAbstracta nod) {
        noduri.remove(nod);
    }

    @Override
    CompAbstracta getNod(int index) {
        return noduri.get(index);
    }
}
