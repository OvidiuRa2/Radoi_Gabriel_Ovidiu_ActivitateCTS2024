package subiectD.proxy;

public class Proxy implements CreareCredit{
    private CreareCredit credit;

    public Proxy(CreareCredit credit) {
        this.credit = credit;
    }

    @Override
    public void creaazaCredit(int suma, String tipMoneda) {
        if(tipMoneda.equals("RON")){
            credit.creaazaCredit(suma,tipMoneda);
        }else{
            System.out.println("Nu se poate realiza creditul");
        }
    }
}
