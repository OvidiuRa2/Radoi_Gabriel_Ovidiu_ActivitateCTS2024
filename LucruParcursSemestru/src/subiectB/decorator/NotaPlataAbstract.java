package subiectB.decorator;

public abstract class NotaPlataAbstract {
    private double sumaDePlata;

    public NotaPlataAbstract(double sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    public double getSumaDePlata() {
        return sumaDePlata;
    }

    public abstract void printeazaNota();
}
