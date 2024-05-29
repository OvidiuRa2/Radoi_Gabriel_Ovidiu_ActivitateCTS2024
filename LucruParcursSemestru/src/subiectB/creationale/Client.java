package subiectB.creationale;

import java.util.ArrayList;
import java.util.List;

public class Client implements CloneClient{

    private String nume;
    List<String> rezervari;

    private Client(){}

    public Client(String nume, List<String> rezervari) {
        this.nume = nume;
        this.rezervari = rezervari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<String> getRezervari() {
        return rezervari;
    }

    public void setRezervari(List<String> rezervari) {
        this.rezervari = rezervari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("subiectB.creationale.Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", rezervari=").append(rezervari);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Client clone() {
        Client clientClonat = new Client();
        clientClonat.nume = nume;
        clientClonat.rezervari = new ArrayList<>();

        for(String rezervare: rezervari){
            clientClonat.rezervari.add(rezervare);
        }

        return clientClonat;
    }
}
