package subiectD.proxy;

public class main {
    public static void main(String[] args) {
        CreareCredit proxy = new Proxy(new Credit());

        proxy.creaazaCredit(1000,"EURO");
    }
}
