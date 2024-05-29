package subiectE.adapter;

public class AdapterEBilet implements MetodeEBIlet{

    private MetodeBIlet metodeBIlet;

    public AdapterEBilet(MetodeBIlet metodeBIlet) {
        this.metodeBIlet = metodeBIlet;
    }

    @Override
    public void cumparaBilet() {
        metodeBIlet.vindeBilet();
    }
}
