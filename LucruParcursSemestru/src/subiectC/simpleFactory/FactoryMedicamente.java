package subiectC.simpleFactory;

public class FactoryMedicamente {

    public Medicament creazaMedicament(CategorieMedicament categorieMedicament, String denumire,float pret){
        return switch (categorieMedicament){

            case Raceala -> new MedicamentRaceala(denumire, pret);
            case Durere -> new MedicamentDurere(denumire, pret);
            case Body -> new MedicamentBody(denumire, pret);
        };
    }
}
