package subiectD.simpleFactory;

public class PersoanaFizica extends Client{

    @Override
    public void descriere() {
        System.out.println("pf");
    }

    public PersoanaFizica(String nume, int varsta) {
        super(nume, varsta);
    }
}
