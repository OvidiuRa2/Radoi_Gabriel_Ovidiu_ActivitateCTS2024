import model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> cantiati = new HashMap<>();
        cantiati.put("clor",2d);
        cantiati.put("azot",5d);
        Reteta reteta = new Reteta("paracetamol",cantiati,7d);

        System.out.println(reteta);

        System.out.println(reteta.cloneaza());
    }
}