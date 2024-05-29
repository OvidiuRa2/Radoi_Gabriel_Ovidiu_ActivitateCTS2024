package subiectE.decorator;

public abstract class PrintareBIlet {
    String numeEchipa1;
    String numeEchipa2;

    public PrintareBIlet(String numeEchipa1, String numeEchipa2) {
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
    }

    abstract void printeazaBilet();

     public String getNumeEchipa1() {
          return numeEchipa1;
     }

     public String getNumeEchipa2() {
          return numeEchipa2;
     }
}
