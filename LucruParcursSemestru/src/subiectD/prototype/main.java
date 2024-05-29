package subiectD.prototype;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("det1");
        lista1.add("det2");
        Cont cont = new Cont("nume",lista1);
        Cont cont1 = (Cont) cont.cloneaza();
        List<String> lista = new ArrayList<>();
        lista.add("det1");
        lista.add("det2");
        lista.add("det3");
        cont1.setNumeCont("dasda");
        cont1.setDateClient(lista);
        System.out.println(cont);
        System.out.println(cont1);

    }
}
