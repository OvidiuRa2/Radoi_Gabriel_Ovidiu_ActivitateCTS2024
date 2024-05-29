package subiectB.strategy.clase;

public class PlataCash implements Plata{
    @Override
    public void plateste(double suma) {
        System.out.println("S a platit cash suma " + suma);
    }
}
