package subiectC.prototype;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String,Double> ingrediente = new HashMap<>();
        ingrediente.put("1",3.0);
        ingrediente.put("2",12.2);
        ingrediente.put("3",10.3);
        Reteta reteta = new Reteta("Mig400",ingrediente,25.5);
        CloneazaReteta reteta1 = reteta.cloneaza();

        Reteta reteta2 = (Reteta)reteta1;
        reteta2.getCompozitieMedicament().put("4",3.0);
        System.out.println(reteta);
        System.out.println(reteta1);
    }
}
