package subiectD.decorator;

public abstract class Decorator implements FunctionalitatiCard{
    private FunctionalitatiCard cardContactLess;

    public Decorator(FunctionalitatiCard cardContactLess) {
        this.cardContactLess = cardContactLess;
    }

    public abstract void plataContactLess(double suma);

    public FunctionalitatiCard getCardContactLess() {
        return cardContactLess;
    }
}
