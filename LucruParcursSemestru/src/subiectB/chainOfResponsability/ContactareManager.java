package subiectB.chainOfResponsability;

public class ContactareManager extends ModContactare{
    @Override
    public void contacteaza(Client client) {
        System.out.println("A fost contactat maangerul pentru clientul " + client.getNume());
    }
}
