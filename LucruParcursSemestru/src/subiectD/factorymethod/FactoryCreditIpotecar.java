package subiectD.factorymethod;

public class FactoryCreditIpotecar implements AbstractFactory{
    @Override
    public Credit creazaCredit(double sumaCredit, double dobanda) {
        return new CreditIpotecar(sumaCredit, dobanda);
    }
}
