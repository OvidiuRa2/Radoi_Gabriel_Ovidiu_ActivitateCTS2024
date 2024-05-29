package subiectD.adapter;

public class CreditBancaAdapter implements CreareCreditPJ{

    private CreareCreditLeasing creditLeasing;

    public CreditBancaAdapter(CreareCreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public void oferaCreditPJ(double suma) {
        creditLeasing.oferaCredit(suma);
    }
}
