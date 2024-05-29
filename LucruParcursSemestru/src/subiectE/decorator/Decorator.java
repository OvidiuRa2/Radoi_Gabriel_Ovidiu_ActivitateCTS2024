package subiectE.decorator;

public abstract class Decorator extends PrintareBIlet {

    private PrintareBIlet biletDecorat;

    public Decorator(String numeEchipa1, String numeEchipa2, PrintareBIlet biletDecorat) {
        super(numeEchipa1, numeEchipa2);
        this.biletDecorat = biletDecorat;
    }

    public PrintareBIlet getBiletDecorat() {
        return biletDecorat;
    }
}
