package subiectD.composite;

public class main {
    public static void main(String[] args) {
        CompAbstracta filiala = new Filiala("filiala1");
        CompAbstracta filiala2 = new Filiala("filiala2");
        CompAbstracta agentie = new Composite("Agentie1");
        CompAbstracta sucursala = new Composite("Sucursala");

        agentie.adaugaNod(filiala);
        agentie.adaugaNod(filiala2);
        agentie.printare();
        agentie.stergeNod(filiala);
        sucursala.adaugaNod(agentie);
        sucursala.printare();
    }
}
