package subiectD.adapter;

public class main {

    public static void main(String[] args) {
        CreareCreditPJ creditAdapter = new CreditBancaAdapter(new CreditLeasingBancaNou());

        creditAdapter.oferaCreditPJ(200);
    }
}
