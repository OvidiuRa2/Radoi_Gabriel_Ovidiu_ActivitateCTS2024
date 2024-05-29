package subiectA.flywieght;

public class DatePacientExtra {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public DatePacientExtra(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }
}
