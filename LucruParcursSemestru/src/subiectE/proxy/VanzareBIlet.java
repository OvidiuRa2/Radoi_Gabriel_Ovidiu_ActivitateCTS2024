package subiectE.proxy;

public class VanzareBIlet implements Vanzare{
    @Override
    public void vindeBilet(CLient client) {
        System.out.println("BIletul a fost vandut pt " + client.getNume());
    }
}
