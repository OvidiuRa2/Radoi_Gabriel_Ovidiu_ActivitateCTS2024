package subiectD.strategy;

public class verificarePF implements modVerificare{
    @Override
    public void verificaDocumente(Client client) {
        ClientPF clientPF = (ClientPF) client;
        System.out.println("Se verifica clientul pf " + clientPF.getNume() + " cu buletinul " +clientPF.getBuletin());
    }
}
