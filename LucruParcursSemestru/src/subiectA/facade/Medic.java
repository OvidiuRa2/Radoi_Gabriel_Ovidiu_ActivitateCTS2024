package subiectA.facade;

public class Medic {

    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean verificareTrebuieInternat(Pacient pacient){
        if(pacient.getStarePacient().equals("grav")){
            return  true;
        }else {
            return  false;
        }
    }
}
