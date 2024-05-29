package subiectB.creationale;

public class SupaLegume extends  Supa{

    public SupaLegume(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void descriere() {
        System.out.println("supa legume");
    }
}
