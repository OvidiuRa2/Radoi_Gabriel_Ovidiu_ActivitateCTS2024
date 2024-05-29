package subiectB.creationale;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance("Res", 20);
        Restaurant restaurant1 = Restaurant.getInstance("dasdasda", 20);

//        subiectB.creationale.FactorySupa factorySupaLegume = new subiectB.creationale.FactorySupaLegume();
//        subiectB.creationale.Supa supa = factorySupaLegume.creazaSupa("supa1", 200);
//        supa.descriere();
//
//        subiectB.creationale.FactorySupa factorySupaCiuperci = new subiectB.creationale.FactorySupaCiuperci();
//        factorySupaCiuperci.creazaSupa("ciuperci",200).descriere();
//
//        subiectB.creationale.Builder builder = new subiectB.creationale.RezervareBuilder();
//
//        subiectB.creationale.Rezervare rezervare = builder.adaugaAsezareGeam().build();
//        rezervare.setDecorareaMesei(true);
//        System.out.println(rezervare);

//        System.out.println(builder.build());


//            subiectB.creationale.FactorySupe factorySupe = new subiectB.creationale.FactorySupe();
//           subiectB.creationale.Supa supa = factorySupe.creazaSupa(subiectB.creationale.TipSupa.CIUPERCI,"ciuperci",20);
//
//        supa.descriere();

        List<String> lista = new ArrayList<>();
        lista.add("rezervare1");
        lista.add("rezervare2");

        Client client = new Client("Andrei", lista);

        Client clona = client.clone();
        clona.getRezervari().add("rez3");

        System.out.println(client);
        System.out.println(clona);
    }
}