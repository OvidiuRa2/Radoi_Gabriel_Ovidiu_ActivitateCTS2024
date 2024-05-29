package subiectB.composite;

public interface ComponentaAbstracta {
    void adaugaCategorie(ComponentaAbstracta componentaAbstracta);
    void stergeCategorie(ComponentaAbstracta componentaAbstracta);
    ComponentaAbstracta getCategorie(int index);
    void printeazaCategorie();
}
