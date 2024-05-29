package subiectD.chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Handler cont1 = new Cont(200,1);
        Handler cont2 = new Cont(300,2);
        Handler cont3 = new Cont(400,3);
        Handler refuz = new PlataRefuzata();
        cont3.setSuccesor(refuz);
        cont2.setSuccesor(cont3);
        cont1.setSuccesor(cont2);

        cont1.realizeazaPlata(360);

    }
}
