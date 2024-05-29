package subiectA.adapter;

public class MedicamentFarmacie {
    String compozitie;

    public MedicamentFarmacie(String compozitie) {
        this.compozitie = compozitie;
    }

    void cumparaMedicament(){
        System.out.println("MEdicamentul cu compozitia "+ compozitie+ " a fost cumparat");
    }
}
