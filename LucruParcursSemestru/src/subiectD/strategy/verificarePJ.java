package subiectD.strategy;

public class verificarePJ implements modVerificare{
    @Override
    public void verificaDocumente(Client client) {
        ClientPJ clientPJ = (ClientPJ) client;
        System.out.println("Se verifica clientul pj " + clientPJ.getNume() + " cu actele " +clientPJ.getActe());
    }
}
