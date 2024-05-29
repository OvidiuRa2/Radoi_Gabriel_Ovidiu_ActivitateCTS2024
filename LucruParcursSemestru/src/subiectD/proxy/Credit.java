package subiectD.proxy;

public class Credit implements CreareCredit {
    @Override
    public void creaazaCredit(int suma, String tipMoneda) {
        System.out.println("A fost creat un credit in " + tipMoneda + " cu suma de " + suma);

    }
}
