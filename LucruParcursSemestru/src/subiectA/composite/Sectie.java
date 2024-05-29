package subiectA.composite;

public class Sectie extends AbstractCategorie{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }



    @Override
    void adaugaCategorie(AbstractCategorie categorie) {
        throw new UnsupportedOperationException();
    }

    @Override
    void stergeCategorie(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    AbstractCategorie getCategorie(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    void printeaza() {
        System.out.println("Sectia " + nume);
    }
}
