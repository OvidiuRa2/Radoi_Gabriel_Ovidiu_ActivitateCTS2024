package subiectD.prototype;

import java.util.ArrayList;
import java.util.List;

public class Cont implements CloneazaCont{
    private String numeCont;
    private List<String> dateClient;

    public Cont(String numeCont, List<String> dateClient) {
        this.numeCont = numeCont;
        this.dateClient = dateClient;
    }

    public String getNumeCont() {
        return numeCont;
    }

    public void setNumeCont(String numeCont) {
        this.numeCont = numeCont;
    }

    public List<String> getDateClient() {
        return dateClient;
    }

    public void setDateClient(List<String> dateClient) {
        this.dateClient = dateClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numeCont='").append(numeCont).append('\'');
        sb.append(", dateClient=").append(dateClient);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public CloneazaCont cloneaza() {
        List<String>date = new ArrayList<>();
        for(String data:this.dateClient){
            date.add(data);
        }
        return new Cont(numeCont,date);
    }
}
