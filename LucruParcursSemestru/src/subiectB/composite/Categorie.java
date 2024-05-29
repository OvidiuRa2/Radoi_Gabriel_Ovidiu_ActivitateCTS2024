package subiectB.composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements ComponentaAbstracta{

    private String denumire;
    private List<ComponentaAbstracta> componentaAbstractaList;
    public Categorie(String denumire) {
        this.denumire = denumire;
        componentaAbstractaList = new ArrayList<>();
    }

    @Override
    public void adaugaCategorie(ComponentaAbstracta componentaAbstracta) {
        componentaAbstractaList.add(componentaAbstracta);
    }

    @Override
    public void stergeCategorie(ComponentaAbstracta componentaAbstracta) {
        componentaAbstractaList.remove(componentaAbstracta);
    }

    @Override
    public ComponentaAbstracta getCategorie(int index) {
        return componentaAbstractaList.get(index);
    }

    @Override
    public void printeazaCategorie() {
        System.out.println("Categoria cu numele " + denumire +" are urmatoarele subcategorii: ");
        for (ComponentaAbstracta comp: componentaAbstractaList){
            comp.printeazaCategorie();
        }
    }
}
