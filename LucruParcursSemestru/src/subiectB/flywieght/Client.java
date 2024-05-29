package subiectB.flywieght;

import java.util.ArrayList;
import java.util.List;

public class Client implements CreareRezervare {

    private String nume;
    private String nrTelefon;
    private List<Rezervare> rezervari;

    public Client(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.rezervari = new ArrayList<>();
    }

    @Override
    public void creazaRezervare(Rezervare rezervare) {
        rezervari.add(rezervare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", rezervari=").append(rezervari);
        sb.append('}');
        return sb.toString();
    }
}
