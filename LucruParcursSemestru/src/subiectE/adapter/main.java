package subiectE.adapter;

public class main {

    public static void main(String[] args) {
        MetodeEBIlet metodeBIlet = new AdapterEBilet(new PlatformaExistenta());
        metodeBIlet.cumparaBilet();
    }
}
