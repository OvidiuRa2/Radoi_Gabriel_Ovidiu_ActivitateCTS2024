package subiectE.state.main;

import subiectE.state.clase.Loc;

public class Main {
    public static void main(String[] args) {
        Loc loc = new Loc();
        loc.rezervaLoc();
        loc.ocupaLoc();
        loc.ocupaLoc();
        loc.rezervaLoc();
        loc.elibereazaLoc();
        loc.ocupaLoc();
    }
}
