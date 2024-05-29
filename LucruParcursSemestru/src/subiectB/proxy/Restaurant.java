package subiectB.proxy;

public class Restaurant implements CreareRezervare{

    @Override
    public void creazaRezervare(int nrPers) {
        System.out.println("Rezervare a fost realizata pentru " + nrPers);
    }
}
