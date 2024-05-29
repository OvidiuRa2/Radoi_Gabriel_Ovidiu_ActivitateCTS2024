package subiectD.strategy;

public class main {
    public static void main(String[] args) {
        Banca banca = new Banca();
        banca.setModVerificare(new verificarePF());
        banca.verificaDocumente(new ClientPF("Andrei","buletins","inreg"));
    }
}
