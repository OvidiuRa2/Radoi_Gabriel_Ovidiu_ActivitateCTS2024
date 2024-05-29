package subiectE.template;

public abstract class AccesPersoane {


    public  final void acces(){
        asezareCOada();
        prezentareBilet();
        ocupareLoc();
    }
    public abstract  void asezareCOada();
    public abstract  void prezentareBilet();
    public abstract  void ocupareLoc();
}
