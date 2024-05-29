package subiectE.simpleFactory;

public class JucatorFactory {

    public Jucator creazaJucator(TIpJucator tIpJucator, String nume,int nr){
        return switch (tIpJucator){

            case PORTAR -> new Portar(nume, nr);
            case FUNDAS -> new Fundas(nume, nr);
            case ATACANT -> new Atacant(nume, nr);
        };
    }
}
