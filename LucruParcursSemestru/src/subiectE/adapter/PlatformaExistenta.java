package subiectE.adapter;

public class PlatformaExistenta implements MetodeBIlet{
    @Override
    public void rezervaBilet() {
        System.out.println("BIletul a fost rezervat");
    }

    @Override
    public void vindeBilet() {
        System.out.println("BIletul a fost vandut");
    }
}
