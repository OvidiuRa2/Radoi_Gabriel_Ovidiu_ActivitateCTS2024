package subiectC.factoryMethod;

public class main {
    public static void main(String[] args) {
        MedicamentFactory factory = new MedicamentBodyFactory();
        System.out.println(factory.creazaMedicament("body",123));
    }
}
