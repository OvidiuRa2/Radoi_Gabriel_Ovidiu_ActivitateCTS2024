package subiectE.singleton;

public class NationalaFotbal {

    private int nrJucatori;
    private String numeEchipa;


    public NationalaFotbal(int nrJucatori, String numeEchipa) {
        this.nrJucatori = nrJucatori;
        this.numeEchipa = numeEchipa;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NationalaFotbal{");
        sb.append("nrJucatori=").append(nrJucatori);
        sb.append(", numeEchipa='").append(numeEchipa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
