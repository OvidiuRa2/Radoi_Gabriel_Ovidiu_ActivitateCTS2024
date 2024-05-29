package subiectE.simpleFactory;

public class FactoryFundas implements AbstractFactory{
    @Override
    public Jucator creazaJucator(String nume, int nr) {
        return new Fundas(nume, nr);
    }
}
