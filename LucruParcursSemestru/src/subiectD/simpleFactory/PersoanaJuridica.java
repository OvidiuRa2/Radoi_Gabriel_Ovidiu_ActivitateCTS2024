package subiectD.simpleFactory;

public class PersoanaJuridica extends Client{

    @Override
    public void descriere() {
        System.out.println("pj");
    }

    public PersoanaJuridica(String nume, int varsta) {
        super(nume, varsta);
    }
}
