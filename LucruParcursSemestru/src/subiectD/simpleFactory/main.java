package subiectD.simpleFactory;

public class main  {
    public static void main(String[] args) {
        ClientFactory factory = new ClientFactory();
Client client =factory.creeazaClient(TipClient.PF,"andrei",23);
        client.descriere();
    }
}
