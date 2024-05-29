package subiectE.composite;

public interface Sectiune {
    void printeaza();
    void adaugaSectiune(Sectiune sectiune);
    void stergeSectiune(Sectiune sectiune);
    Sectiune getSectiune(int index);

}
