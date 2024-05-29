package subiectD.simpleFactory;

public class ClientFactory {

    Client creeazaClient(TipClient tipClient,String nume, int varsta){
        return switch (tipClient){

            case PF -> new PersoanaFizica(nume, varsta);
            case PJ -> new PersoanaJuridica(nume, varsta);
        };
    }
}
