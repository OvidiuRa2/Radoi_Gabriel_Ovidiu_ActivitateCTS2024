package subiectE.flyweight;

public class Persoana implements Flywieght {
    private String codPersoana;
    private int inaltime;
    private int latime;

    public Persoana(String codPersoana, int inaltime, int latime) {
        this.codPersoana = codPersoana;
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public void deseneazaPersoana(DetaliiPersoana detaliiPersoana) {
        System.out.println("Persoana desenata la poz " + detaliiPersoana.getPozitie());
    }
}
