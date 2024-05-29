package subiectB.strategy.clase;

public class PlataCard implements Plata{
    @Override
    public void plateste(double suma) {
        System.out.println("S a platit cu cardul suma " + suma);
    }
}
