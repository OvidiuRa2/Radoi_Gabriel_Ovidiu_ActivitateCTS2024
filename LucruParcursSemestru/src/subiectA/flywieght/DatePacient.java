package subiectA.flywieght;

public class DatePacient implements Flyweight{
    private int codPacient;
    private String nume;
    private String nrTelefon;
    private String adresa;

    public DatePacient(int codPacient, String nume, String nrTelefon, String adresa) {
        this.codPacient = codPacient;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public int getCodPacient() {
        return codPacient;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DatePacient{");
        sb.append("codPacient=").append(codPacient);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void interneaza(DatePacientExtra datePacientExtra) {
        System.out.println("Pacientul " + nume + "a fost internat in" + datePacientExtra.getNrSalon() +datePacientExtra.getNrPat()+" pentru " + datePacientExtra.getNrZileSpitalizare());
    }
}
