package subiectA.adapter;

public class MedicamentSpital {

    String compozitie;
    String reteta;

    public MedicamentSpital(String compozitie, String reteta) {
        this.compozitie = compozitie;
        this.reteta = reteta;
    }

    public String getReteta() {
        return reteta;
    }

    void achizitioneazaMedicament(){
        prezintaReteta();
    }
    void prezintaReteta(){
        System.out.println("Reteta are compozitia: " + compozitie);
    }
}
