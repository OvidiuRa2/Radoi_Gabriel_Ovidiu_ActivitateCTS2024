package subiectD.strategy;

public class Banca {
    private modVerificare modVerificare;

    public Banca() {
        modVerificare = new verificarePF();
    }

    public void setModVerificare(subiectD.strategy.modVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaDocumente(Client client){
        modVerificare.verificaDocumente(client);
    }
}
