package subiectD.facade;

public class Facade {
    private MetodeVerificareCOnt verificareCOnt;

    public Facade(MetodeVerificareCOnt verificareCOnt) {
        this.verificareCOnt = verificareCOnt;
    }

    public boolean verificaClientEligibil(Client client) {
        return verificareCOnt.verificaVarsta(client.getVarsta()) && verificareCOnt.urmaritPolitie() == false
                && verificareCOnt.areCreataALteBanci() == false;
    }
}
