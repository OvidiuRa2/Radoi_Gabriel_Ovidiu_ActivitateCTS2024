package decorator;

public abstract class Decorator implements BiletAbstract{
private BiletAbstract bilet;

    public Decorator(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public BiletAbstract getBilet() {
        return bilet;
    }
}
