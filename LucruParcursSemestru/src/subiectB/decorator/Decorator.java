package subiectB.decorator;

public abstract class Decorator extends NotaPlataAbstract{

    private NotaPlataAbstract notaPlataAbstract;

    public Decorator( NotaPlataAbstract notaPlataAbstract) {
        super(notaPlataAbstract.getSumaDePlata());
        this.notaPlataAbstract = notaPlataAbstract;
    }

    public NotaPlataAbstract getNotaPlataAbstract() {
        return notaPlataAbstract;
    }
}
