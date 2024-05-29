package subiectD.flyweight;

import java.util.ArrayList;
import java.util.List;

public class DetinatorCont implements Flyweight{
    private String nume;
    private String adresa;
    private InfoBanca infoBanca;
    private List<Cont> conturi;

    public DetinatorCont(String nume, String adresa, InfoBanca infoBanca) {
        this.nume = nume;
        this.adresa = adresa;
        this.infoBanca = infoBanca;
        conturi = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public List<Cont> getConturi() {
        return conturi;
    }

    public String getAdresa() {
        return adresa;
    }

    public InfoBanca getInfoBanca() {
        return infoBanca;
    }

    @Override
    public void adaugaCont(Cont cont) {
        conturi.add(cont);
    }
}
