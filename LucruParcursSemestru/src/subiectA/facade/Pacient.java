package subiectA.facade;

public class Pacient {
    private String starePacient;
    private String nume;

    public Pacient(String starePacient, String nume) {
        this.starePacient = starePacient;
        this.nume = nume;
    }

    public String getStarePacient() {
        return starePacient;
    }

    public String getNume() {
        return nume;
    }
}
