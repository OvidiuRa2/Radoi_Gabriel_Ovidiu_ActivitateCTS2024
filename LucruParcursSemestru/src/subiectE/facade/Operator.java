package subiectE.facade;

public class Operator {

    public boolean verificaPersoana(String serieBuletin, String codBIlet){
      return   verificaNumeBIlet() &&
        AplicatiePolitie.cautaCautatPolitiei(serieBuletin) &&
        verificaAntecedente();

    }

    private boolean verificaNumeBIlet(){
        System.out.println("NUmele de pe bilet coincide cu cel din buletin");
        return true;

    }

    private boolean verificaAntecedente(){
        System.out.println("fara atenecednete");
        return true;

    }

}
