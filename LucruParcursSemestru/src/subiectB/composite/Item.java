package subiectB.composite;

public class Item implements ComponentaAbstracta{

    private String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaCategorie(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeCategorie(ComponentaAbstracta componentaAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentaAbstracta getCategorie(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void printeazaCategorie() {
        System.out.println("Item ul cu denumirea " + denumire);
    }
}
