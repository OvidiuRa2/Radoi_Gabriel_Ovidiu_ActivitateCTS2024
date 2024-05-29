package subiectC.buider;

public interface Builder {
    Factura build();
    Builder adaugaNrPungi(int nrPungi);
    Builder adaugaPlataCard();
    Builder adaugaCardFidelitate();
    Builder adaugaCotaTva(int cota);
}
