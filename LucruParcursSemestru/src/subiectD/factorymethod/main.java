package subiectD.factorymethod;

public class main {
    public static void main(String[] args) {
        AbstractFactory factory = new FactoryCreditIpotecar();
        System.out.println(factory.creazaCredit(200,100));
    }
}
