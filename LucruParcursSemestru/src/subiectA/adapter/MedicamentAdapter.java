package subiectA.adapter;

public class MedicamentAdapter extends MedicamentFarmacie{

    private MedicamentSpital medicamentSpital;


    public MedicamentAdapter( MedicamentSpital medicamentSpital) {
        super(medicamentSpital.compozitie);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    void cumparaMedicament() {
        if(medicamentSpital.getReteta() != null){
        medicamentSpital.achizitioneazaMedicament();
        }else{

        super.cumparaMedicament();
        }
    }
}
