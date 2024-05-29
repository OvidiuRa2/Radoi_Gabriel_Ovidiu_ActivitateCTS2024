package subiectB.proxy;

public class main {
    public static void main(String[] args) {
        CreareRezervare proxy = new Proxy(new Restaurant());

        proxy.creazaRezervare(10);
        proxy.creazaRezervare(2);
    }
}
