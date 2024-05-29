package subiectD.composite;

public class Filiala extends CompAbstracta{
    public Filiala(String denumire) {
        super(denumire);
    }

    @Override
    void printare() {
        System.out.println("FIliala cu numele " + getDenumire());
    }

    @Override
    void adaugaNod(CompAbstracta nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    void stergeNod(CompAbstracta nod) {
        throw new UnsupportedOperationException();

    }

    @Override
    CompAbstracta getNod(int index) {
        throw new UnsupportedOperationException();

    }
}
