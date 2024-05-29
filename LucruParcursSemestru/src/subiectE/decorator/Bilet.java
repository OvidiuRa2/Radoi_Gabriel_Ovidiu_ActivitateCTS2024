package subiectE.decorator;

public class Bilet extends PrintareBIlet {

    public Bilet(String numeEchipa1, String numeEchipa2) {
        super(numeEchipa1, numeEchipa2);
    }

    @Override
    public void printeazaBilet() {
        System.out.println("Vizionare placuta!");
    }


}
