package subiectB.template;

public class Restaurant extends Template{
    @Override
    public void curataMasa() {
        System.out.println("Masa a fost curatata");
    }

    @Override
    public void asezareServetele() {
        System.out.println("Se aseaza servetelele");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println("Se aseaza tacamurile");
    }

    public void rezervaMasa(){
        super.ocupareMasa();
    }
}
