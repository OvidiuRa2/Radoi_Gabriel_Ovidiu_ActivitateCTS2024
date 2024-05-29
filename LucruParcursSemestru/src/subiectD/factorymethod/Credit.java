package subiectD.factorymethod;

public abstract class Credit {
    private double sumaCredit;
    private double dobanda;

    public Credit(double sumaCredit, double dobanda) {
        this.sumaCredit = sumaCredit;
        this.dobanda = dobanda;
    }

    public double getSumaCredit() {
        return sumaCredit;
    }

    public void setSumaCredit(double sumaCredit) {
        this.sumaCredit = sumaCredit;
    }

    public double getDobanda() {
        return dobanda;
    }

    public void setDobanda(double dobanda) {
        this.dobanda = dobanda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("sumaCredit=").append(sumaCredit);
        sb.append(", dobanda=").append(dobanda);
        sb.append('}');
        return sb.toString();
    }
}
