package subiectB.composite;

public class main {
    public static void main(String[] args) {
        ComponentaAbstracta item1 = new Item("apaPlata");
        ComponentaAbstracta item2 = new Item("apaMinerala");

        ComponentaAbstracta sucuri = new Categorie("sucuri");
        ComponentaAbstracta cafea = new Categorie("cafea");

        ComponentaAbstracta meniu = new Categorie("meniu");
        sucuri.adaugaCategorie(item1);
        sucuri.adaugaCategorie(item2);
        meniu.adaugaCategorie(sucuri);
        meniu.adaugaCategorie(cafea);

        meniu.printeazaCategorie();
    }
}
