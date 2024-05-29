package subiectE.strategy;

public class AngajatStadion {
    private TIpVerificare tIpVerificare;

    public void settIpVerificare(TIpVerificare tIpVerificare) {
        this.tIpVerificare = tIpVerificare;
    }

    public void verificaPersoana(){
        tIpVerificare.verificaPersoana();
    }
}
