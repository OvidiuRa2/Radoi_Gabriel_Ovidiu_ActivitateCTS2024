package subiectB.chainOfResponsability;

public class main {
    public static void main(String[] args) {
        Client client = new Client("alex");
//        client.setNrTelefon("07243");
//        client.setEmail("sdas@gmai.com");

        ModContactare contactareSMS = new ContactareSMS();
        ModContactare contactareEmail = new ContactareEmail();
        contactareEmail.setSuccesor(new ContactareManager());
        contactareSMS.setSuccesor(contactareEmail);
        contactareSMS.contacteaza(client);

    }
}
