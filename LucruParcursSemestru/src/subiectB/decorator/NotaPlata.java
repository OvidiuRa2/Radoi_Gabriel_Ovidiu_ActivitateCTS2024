package subiectB.decorator;

public class NotaPlata extends NotaPlataAbstract{

    public NotaPlata(double sumaDePlata) {
        super(sumaDePlata);
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata are suma de " + getSumaDePlata());
    }
}
