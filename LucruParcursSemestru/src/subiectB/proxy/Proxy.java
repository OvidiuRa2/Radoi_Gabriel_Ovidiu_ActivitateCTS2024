package subiectB.proxy;

public class Proxy implements CreareRezervare{

    private Restaurant restaurant;

    public Proxy(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void creazaRezervare(int nrPers) {
        if(nrPers >=4){
            restaurant.creazaRezervare(nrPers);
        }else{
            System.out.println("Rezervarile se fac peste 4 pers");
        }
    }
}
