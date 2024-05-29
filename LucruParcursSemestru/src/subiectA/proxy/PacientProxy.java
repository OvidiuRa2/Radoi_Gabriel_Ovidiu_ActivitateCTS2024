package subiectA.proxy;

public class PacientProxy implements Internat{
    private Internat pacient;

    public PacientProxy(Internat pacient) {
        this.pacient = pacient;
    }

    @Override
    public void interneaza() {
        if(((Pacient)pacient).isAreCardSanatate() == true){
            pacient.interneaza();
        }else{
            System.out.println("Spitalul este plin");
        }
    }
}
