package subiectA.composite;

public abstract class AbstractCategorie {
    abstract void adaugaCategorie(AbstractCategorie categorie);
    abstract void stergeCategorie(int index);
    abstract  AbstractCategorie getCategorie(int index);
    abstract  void printeaza();
}
