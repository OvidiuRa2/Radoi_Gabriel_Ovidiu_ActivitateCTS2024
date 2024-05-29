package subiectA.proxy;

public class Pacient implements Internat{
    private String nume;
    private boolean areCardSanatate;

    public Pacient(String nume, boolean areCardSanatate) {
        this.nume = nume;
        this.areCardSanatate = areCardSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreCardSanatate() {
        return areCardSanatate;
    }


    @Override
    public void interneaza() {
        System.out.println("Pacientul cu numele " + nume + " si cu card " + areCardSanatate + " a fost internat");
    }
}
