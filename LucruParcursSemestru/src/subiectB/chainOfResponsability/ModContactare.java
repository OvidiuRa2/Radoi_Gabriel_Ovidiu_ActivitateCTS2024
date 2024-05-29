package subiectB.chainOfResponsability;

public abstract class ModContactare {
    private ModContactare succesor;

    public ModContactare getSuccesor() {
        return succesor;
    }

    public void setSuccesor(ModContactare succesor) {
        this.succesor = succesor;
    }
    public abstract void contacteaza(Client client);
}
