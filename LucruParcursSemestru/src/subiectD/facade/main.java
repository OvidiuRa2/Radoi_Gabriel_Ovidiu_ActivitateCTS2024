package subiectD.facade;

public class main {
    public static void main(String[] args) {
        Facade facade = new Facade(new MetodeVerificareCOnt());
        System.out.println(facade.verificaClientEligibil(new Client("ANdrei",19)));
    }
}
