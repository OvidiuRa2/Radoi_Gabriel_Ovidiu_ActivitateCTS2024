package subiectE.strategy;

public class VerificareVip implements TIpVerificare{
    @Override
    public void verificaPersoana() {
        System.out.println("Biletul a fost verificat pt VIP");
    }
}
