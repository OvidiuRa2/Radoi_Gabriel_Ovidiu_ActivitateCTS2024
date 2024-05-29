package subiectD.chainOfResponsability;

public abstract class Handler {
    private Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public Handler getSuccesor() {
        return succesor;
    }

    abstract void realizeazaPlata(int suma);
}
