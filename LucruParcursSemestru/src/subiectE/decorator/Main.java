package subiectE.decorator;

public class Main {
    public static void main(String[] args) {
        Decorator bilet = new BiletDecorat("echipa","locala",new Bilet("echipa","locala"));
        bilet.printeazaBilet();
    }
}
