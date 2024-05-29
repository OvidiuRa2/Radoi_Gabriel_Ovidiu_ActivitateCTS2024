package subiectC.simpleFactory;

public class Main {
    public static void main(String[] args) {
        FactoryMedicamente factoryMedicamente = new FactoryMedicamente();
        Medicament medicament = factoryMedicamente.creazaMedicament(CategorieMedicament.Durere,"dasda",123);

        System.out.println(medicament);
    }
}
