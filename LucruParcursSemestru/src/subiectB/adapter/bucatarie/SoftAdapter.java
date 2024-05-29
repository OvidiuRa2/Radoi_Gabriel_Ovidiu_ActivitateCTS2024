package subiectB.adapter.bucatarie;

import subiectB.adapter.bar.SoftBar;

public class SoftAdapter extends SoftBucatarie{

    private SoftBar softBar;

    public SoftAdapter(SoftBar softBar, double sumaDePlata) {
        super(sumaDePlata);
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura() {
        softBar.printareFacturaBar();
        System.out.println("Factura bucatarie printata pt suma de " + getSumaDePlata());
    }
}
