package subiectB.template;

public abstract class Template {

    public abstract void curataMasa();
    public abstract void asezareServetele();
    public abstract void asezareTacamuri();

    protected final void ocupareMasa(){
        curataMasa();
        asezareServetele();
        asezareTacamuri();
    }
}
