package subiectA.flywieght;

public class main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight pacient1 = new DatePacient(1, "Andrei", "123", "dasda");
        Flyweight pacient2 = new DatePacient(2, "Alex", "123", "dasda");
        Flyweight pacient3 = new DatePacient(3, "Ana", "123", "dasda");
        factory.getPacient(pacient1).interneaza(new DatePacientExtra(1,2,10));
    }
}
