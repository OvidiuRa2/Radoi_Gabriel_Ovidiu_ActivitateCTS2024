package subiectB.adapter.bar;

public class SoftBarImpl implements SoftBar{

    private double sumaIncasata;

    public SoftBarImpl(double sumaIncasata) {
        this.sumaIncasata = sumaIncasata;
    }

    @Override
    public void incaseazaBani(double bani) {
        sumaIncasata += bani;
    }

    @Override
    public void printareFacturaBar() {
        System.out.println("Factura la bar a fost printata pentru suma de " + sumaIncasata);
    }

    public double getSumaIncasata() {
        return sumaIncasata;
    }
}
