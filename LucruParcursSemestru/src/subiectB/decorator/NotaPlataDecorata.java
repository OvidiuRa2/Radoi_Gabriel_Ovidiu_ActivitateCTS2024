package subiectB.decorator;

public class NotaPlataDecorata extends Decorator{

    public NotaPlataDecorata(NotaPlataAbstract notaPlataAbstract) {
        super(notaPlataAbstract);
    }

    @Override
    public void printeazaNota() {
        super.getNotaPlataAbstract().printeazaNota();
        System.out.println("La multi ani");
    }
}
