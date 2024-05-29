package subiectD.decorator;

public class CardContactLess extends Decorator{
    public CardContactLess(FunctionalitatiCard cardContactLess) {
        super(cardContactLess);
    }

    @Override
    public void plataContactLess(double suma) {
        System.out.println("S a platit contact less suma de " + suma);
    }

    @Override
    public void platesteOnline(double suma) {
        getCardContactLess().platesteOnline(suma);
    }

    @Override
    public void platesteFizic(double suma) {
        getCardContactLess().platesteFizic(suma);
    }
}
