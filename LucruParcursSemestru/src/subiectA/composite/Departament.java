package subiectA.composite;

import java.util.ArrayList;
import java.util.List;

public class Departament extends AbstractCategorie{
    private String nume;
    private List<AbstractCategorie> subCategorii;


    public Departament(String nume) {
        this.nume = nume;
        subCategorii = new ArrayList<>();
    }


    @Override
    void adaugaCategorie(AbstractCategorie categorie) {
        subCategorii.add(categorie);
    }

    @Override
    void stergeCategorie(int index) {
        subCategorii.remove(index);
    }

    @Override
    AbstractCategorie getCategorie(int index) {
        return subCategorii.get(index);
    }

    @Override
    void printeaza() {
        System.out.println("Departamentul " + nume);
        for(var c: subCategorii){
            c.printeaza();
        }
    }
}
