package subiectB.creationale;

public class FactorySupe {

    public Supa creazaSupa(TipSupa tipSupa, String denumire, float pret){
       return switch (tipSupa){
        case LEGUME ->  new SupaLegume(denumire,pret);
        case CIUPERCI -> new SupaCiuperci(denumire,pret);
       };
    }
}
