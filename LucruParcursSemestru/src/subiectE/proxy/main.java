package subiectE.proxy;

public class main {
    public static void main(String[] args) {
        Vanzare bilet = new VanzareBiletProxy(new VanzareBIlet());

        bilet.vindeBilet(new CLient("Andrei",13));
    }
}
