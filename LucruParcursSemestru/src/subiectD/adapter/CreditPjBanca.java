package subiectD.adapter;

public class CreditPjBanca implements CreareCreditPJ{
    @Override
    public void oferaCreditPJ(double suma) {
        System.out.println("A fost oferit un credit pt pj in valaore de " + suma);
    }
}
