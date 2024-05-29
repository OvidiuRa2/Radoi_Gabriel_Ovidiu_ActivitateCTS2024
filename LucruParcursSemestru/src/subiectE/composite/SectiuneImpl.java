package subiectE.composite;

import java.util.ArrayList;
import java.util.List;

public class SectiuneImpl implements Sectiune{
    private String denumire;
    private List<Sectiune> sectiuni;

    public SectiuneImpl(String denumire) {
        this.denumire = denumire;
        sectiuni = new ArrayList<>();
    }

    @Override
    public void printeaza() {
        System.out.println("Sectiunea cu numele: " + denumire);
        for(Sectiune sectiune:sectiuni){
            sectiune.printeaza();
        }
    }

    @Override
    public void adaugaSectiune(Sectiune sectiune) {
        sectiuni.add(sectiune);
    }

    @Override
    public void stergeSectiune(Sectiune sectiune) {
        sectiuni.remove(sectiune);
    }

    @Override
    public Sectiune getSectiune(int index) {
        return sectiuni.get(index);
    }
}
