package decorator;

public class BiletZiStb extends Decorator{
    public BiletZiStb(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeaza() {
        super.getBilet().printeaza();
        System.out.println("La multi ani!");
    }
}
