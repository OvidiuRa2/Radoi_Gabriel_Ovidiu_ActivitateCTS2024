package subiectC.prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements CloneazaReteta{
    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;
    private Double gramaj;

    private Reteta(){}

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramaj) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramaj = gramaj;

        double suma = compozitieMedicament.values().stream().reduce(0d,(a,b)->a+b);

        if(suma!= gramaj){
            throw  new RuntimeException("Gramaj Incorect");
        }
    }

    @Override
    public CloneazaReteta cloneaza() {
        Reteta reteta = new Reteta();
        reteta.numeMedicament = numeMedicament;
        reteta.gramaj = gramaj;
        reteta.compozitieMedicament = new HashMap<>();
        for(String val: compozitieMedicament.keySet()){
            reteta.compozitieMedicament.put(val,compozitieMedicament.get(val));
        }

        return reteta;
    }


    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public Map<String, Double> getCompozitieMedicament() {
        return compozitieMedicament;
    }

    public void setCompozitieMedicament(Map<String, Double> compozitieMedicament) {
        this.compozitieMedicament = compozitieMedicament;
    }

    public Double getGramaj() {
        return gramaj;
    }

    public void setGramaj(Double gramaj) {
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compozitieMedicament=").append(compozitieMedicament);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
