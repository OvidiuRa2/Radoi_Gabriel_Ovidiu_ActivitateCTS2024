package subiectB.creationale;

public class Rezervare {
    private boolean asezareGeam;
    private boolean scaunErgonomic;
    private boolean decorareaMesei;

    public Rezervare(boolean asezareGeam, boolean scaunErgonomic, boolean decorareaMesei) {
        this.asezareGeam = asezareGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorareaMesei = decorareaMesei;
    }

    public boolean isAsezareGeam() {
        return asezareGeam;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isDecorareaMesei() {
        return decorareaMesei;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("subiectB.creationale.Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append('}');
        return sb.toString();
    }
}
