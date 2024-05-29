package subiectD.factorymethod;

public class FactoryCreditPersonal implements AbstractFactory{
    @Override
    public Credit creazaCredit(double sumaCredit, double dobanda) {
        return new CreditPersonal(sumaCredit,dobanda);
    }
}
