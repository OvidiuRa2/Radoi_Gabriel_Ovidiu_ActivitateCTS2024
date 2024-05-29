package subiectE.composite;

public class Loc implements Sectiune {

    private String numar;

    public Loc(String numar) {
        this.numar = numar;
    }

    @Override
    public void printeaza() {
        System.out.println("S a ocupat locul " + numar);
    }

    @Override
    public void adaugaSectiune(Sectiune sectiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeSectiune(Sectiune sectiune) {
        throw new UnsupportedOperationException();

    }

    @Override
    public Sectiune getSectiune(int index) {
        throw new UnsupportedOperationException();
    }
}
