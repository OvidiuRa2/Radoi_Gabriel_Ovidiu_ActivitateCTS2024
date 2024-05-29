package subiectB.chainOfResponsability;

public class ContactareEmail extends ModContactare{
    @Override
    public void contacteaza(Client client) {
        if(client.getEmail() != null){
            System.out.println("Email trimis");
        }else{
            getSuccesor().contacteaza(client);
        }
    }
}
