package subiectB.facade;

public class Chelner {

    private VerificariRestaurant verificariRestaurant;

    public Chelner(VerificariRestaurant verificariRestaurant) {
        this.verificariRestaurant = verificariRestaurant;
    }

    public boolean verificareMasaDisponibila(){
        return verificariRestaurant.verificareMasaLibera() &&
        verificariRestaurant.verificareMasaDebarasata() &&
        verificariRestaurant.verificareServetele();
    }
}
