package decorator;

public class Bilet implements BiletAbstract{
    private double pret;
    private int nrCalatorii;

    public Bilet(double pret, int nrCalatorii) {
        this.pret = pret;
        this.nrCalatorii = nrCalatorii;
    }

    public double getPret() {
        return pret;
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    @Override
    public void printeaza() {
        System.out.println("Biletul cu pretul "+ pret+" are " + nrCalatorii+" calatorii ramase.");
    }
}
