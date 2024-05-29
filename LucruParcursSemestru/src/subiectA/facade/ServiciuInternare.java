package subiectA.facade;

public class ServiciuInternare {
    Pacient pacient;
    Medic medic;
    Salon salon;

    public ServiciuInternare(Pacient pacient, Medic medic, Salon salon) {
        this.pacient = pacient;
        this.medic = medic;
        this.salon = salon;
    }

    public boolean verificareInternare(){
        if(medic.verificareTrebuieInternat(pacient) && salon.getPaturiLibere().size()>0){
            return  true;
        }
        return false;
    }
}
