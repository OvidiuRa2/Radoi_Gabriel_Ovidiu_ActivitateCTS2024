package subiectA.proxy;

public class main {
    public static void main(String[] args) {
        PacientProxy proxy = new PacientProxy(new Pacient("Andrei",false));
        PacientProxy proxy1 = new PacientProxy(new Pacient("Mihai",true));

        proxy1.interneaza();
        proxy.interneaza();
    }
}
