package subiectB.creationale;

public class SupaCiuperci extends  Supa{

    public SupaCiuperci(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("supa ciuperci");
    }
}
