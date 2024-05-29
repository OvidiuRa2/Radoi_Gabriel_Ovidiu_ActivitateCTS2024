package subiectD.chainOfResponsability;

public class Cont extends Handler{
    private int sold;
    private int nrCont;

    public Cont(int sold, int nrCont) {
        this.sold = sold;
        this.nrCont = nrCont;
    }

    @Override
    void realizeazaPlata(int suma) {
        if(sold<suma){
            getSuccesor().realizeazaPlata(suma);
        }else{
            System.out.println("Contul cu nr " + nrCont + " a realizat plata");
        }
    }
}
