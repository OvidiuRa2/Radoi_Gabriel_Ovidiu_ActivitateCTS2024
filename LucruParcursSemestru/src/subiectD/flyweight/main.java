package subiectD.flyweight;

public class main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        InfoBanca info = new InfoBanca("bcr", "bcr1");
        Flyweight detinatorCont =  factory.getDetinatorCont("Andrei","asdas",info);
        detinatorCont.adaugaCont(new Cont("123",300));
        detinatorCont.adaugaCont(new Cont("123",222));

        System.out.println(((DetinatorCont)(factory.getDetinatorCont("Andrei","asdas",info))).getConturi());
    }
}
