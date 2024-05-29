package subiectD.adapter;

public class CreditLeasingBancaNou implements CreareCreditLeasing{
    @Override
    public void oferaCredit(double suma) {
        System.out.println("S a oferit un credit pt leasing cu suma de " + suma);
    }
}
