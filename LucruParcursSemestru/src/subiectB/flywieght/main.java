package subiectB.flywieght;

public class main {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        CreareRezervare client =  factory.getClient("Andrei","12345");
        client.creazaRezervare(new Rezervare(1,5));
        factory.getClient("Andrei","12345").creazaRezervare(new Rezervare(2,3));

        System.out.println(factory.getClient("Andrei","12345"));

    }
}
