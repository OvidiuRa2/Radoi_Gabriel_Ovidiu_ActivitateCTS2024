package subiectE.proxy;

public class VanzareBiletProxy implements Vanzare{

    private Vanzare vanzareBilet;

    public VanzareBiletProxy(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(CLient client) {
        if(client.getVarsta() >=14){
            vanzareBilet.vindeBilet(client);
        }else{
            System.out.println("Varsta prea mica");
        }
    }
}
