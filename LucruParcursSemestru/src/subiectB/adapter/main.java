package subiectB.adapter;

import subiectB.adapter.bar.SoftBarImpl;
import subiectB.adapter.bucatarie.SoftAdapter;
import subiectB.adapter.bucatarie.SoftBucatarie;

public class main {
    public static void main(String[] args) {
        SoftBucatarie adapter = new SoftAdapter(new SoftBarImpl(200d),100);
        adapter.printeazaFactura();
    }
}
