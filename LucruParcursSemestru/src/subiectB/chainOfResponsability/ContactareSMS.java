package subiectB.chainOfResponsability;

public class ContactareSMS extends ModContactare{
    @Override
    public void contacteaza(Client client) {
        if(client.getNrTelefon() != null){
            System.out.println("SMS trimis");
        }else{
            getSuccesor().contacteaza(client);
        }
    }
}
