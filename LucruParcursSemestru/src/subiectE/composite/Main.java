package subiectE.composite;

public class Main {
    public static void main(String[] args) {
        Sectiune loc1 = new Loc("1");
        Sectiune loc2 = new Loc("2");
        Sectiune tribuna1 = new SectiuneImpl("Tribuna 1");
        Sectiune peluzaNord = new SectiuneImpl("Peluza Nord");

        Sectiune peluza = new SectiuneImpl("Peluza");
        Sectiune tribuna = new SectiuneImpl("Tribuna");

        tribuna1.adaugaSectiune(loc1);
        tribuna1.adaugaSectiune(loc2);
        peluza.adaugaSectiune(peluzaNord);
        tribuna.adaugaSectiune(tribuna1);
        peluza.printeaza();
    }

}
