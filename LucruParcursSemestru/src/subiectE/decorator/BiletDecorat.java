package subiectE.decorator;

public class BiletDecorat extends Decorator {

    public BiletDecorat(String numeEchipa1, String numeEchipa2, PrintareBIlet biletDecorat) {
        super(numeEchipa1, numeEchipa2, biletDecorat);
    }

    @Override
    void printeazaBilet() {
        getBiletDecorat().printeazaBilet();
        if (getNumeEchipa1().equals("locala") || getNumeEchipa2().equals("locala")) {
            System.out.println("Hai locala");
        }
    }
}
