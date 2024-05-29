package subiectD.template;

public abstract class MetodeExtragere {

    public final void extragere(){
        introduceCard();
        introducePin();
        extrageBani();
        extrageCard();
    }

    public abstract void introduceCard();
    public abstract void introducePin();
    public abstract void extrageBani();
    public abstract void extrageCard();
}
