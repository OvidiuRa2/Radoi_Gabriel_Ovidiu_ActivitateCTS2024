package subiectE.state.clase;

public class Loc {
    private Stare stare;

    public Loc() {
        stare = new StareLiber();
    }

    public void rezervaLoc(){
        if(stare instanceof StareLiber){
            System.out.println("Locul a fost rezervat");
            stare = new StareRezervat();
        }else{
            System.out.println("Locul nu poate fi rezervat");
        }
    }

    public void ocupaLoc(){
            if(stare instanceof  StareLiber || stare instanceof  StareRezervat){
                System.out.println("Locul a fost ocupat");
                stare = new StareOcupat();
            }else{
                System.out.println("Locul nu poate fi ocupat");
            }
    }

    public void elibereazaLoc(){
        if(stare instanceof StareOcupat){
            System.out.println("Locul a fost eliberat");
            stare = new StareLiber();
        }else{
            System.out.println("Locul nu poate fi eliberat");
        }
    }
}
