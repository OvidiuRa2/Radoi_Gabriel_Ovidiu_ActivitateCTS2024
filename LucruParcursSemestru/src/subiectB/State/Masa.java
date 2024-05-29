package subiectB.State;

public class Masa {
    private Stare stare;

    public Masa() {
        stare = new Libera();
    }

    public void ocupaMasa(){
        if(stare instanceof Rezervata){
            System.out.println("Masa a fost ocupata");
            stare = new Ocupata();
        }else{
            System.out.println("Masa nu poate fi ocupata");
        }
    }
    public void elibereazaMasa(){
        if(stare instanceof Ocupata){
            System.out.println("Masa a fost eliberata");
            stare = new Libera();
        }else{
            System.out.println("Masa nu poate fi eliberata");
        }
    }
    public void rezervaMasa(){
        if(stare instanceof Libera){
            System.out.println("Masa a fost rezervata");
            stare = new Rezervata();
        }else{
            System.out.println("masa nu poate fi rezervata");
        }
    }

    public Stare getStare() {
        return stare;
    }
}

