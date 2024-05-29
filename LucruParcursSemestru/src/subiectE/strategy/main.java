package subiectE.strategy;

public class main {
    public static void main(String[] args) {
        AngajatStadion angajatStadion = new AngajatStadion();
        angajatStadion.settIpVerificare(new VerificarePeluza());
        angajatStadion.verificaPersoana();
        angajatStadion.settIpVerificare(new VerificareVip());
        angajatStadion.verificaPersoana();
    }
}
