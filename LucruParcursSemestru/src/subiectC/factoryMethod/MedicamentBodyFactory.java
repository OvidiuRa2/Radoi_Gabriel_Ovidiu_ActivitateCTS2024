package subiectC.factoryMethod;

public class MedicamentBodyFactory implements MedicamentFactory{
    @Override
    public Medicament creazaMedicament(String denumire, float pret) {
        return new MedicamentBody(denumire, pret);
    }
}
