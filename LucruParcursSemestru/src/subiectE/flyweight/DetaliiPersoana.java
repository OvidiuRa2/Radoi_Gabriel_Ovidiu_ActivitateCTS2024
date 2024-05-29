package subiectE.flyweight;

public class DetaliiPersoana {
    private String pozitie;
    private String culoare;

    public DetaliiPersoana(String pozitie, String culoare) {
        this.pozitie = pozitie;
        this.culoare = culoare;
    }

    public String getPozitie() {
        return pozitie;
    }

    public String getCuloare() {
        return culoare;
    }
}
