package subiectD.decorator;

public class Card implements FunctionalitatiCard{
    @Override
    public void platesteOnline(double suma) {
        System.out.println("S a fct o plata online in valoare de " + suma);
    }

    @Override
    public void platesteFizic(double suma) {
        System.out.println("S a fct o plata fizic in valoare de " + suma);
    }
}
