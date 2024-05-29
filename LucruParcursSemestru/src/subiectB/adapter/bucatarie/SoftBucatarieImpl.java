package subiectB.adapter.bucatarie;

public class SoftBucatarieImpl extends SoftBucatarie {

    public SoftBucatarieImpl(double sumaDePlata) {
        super(sumaDePlata);
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Factura a fost emisa cu suma de plata " + super.getSumaDePlata()    );
    }
}
