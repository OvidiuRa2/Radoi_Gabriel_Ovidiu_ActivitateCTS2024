package subiectE.builder;

public class main {

    public static void main(String[] args) {
        Rezervare rezervare = new RezervareBuilder(23).adaugaScaun().build();
        System.out.println(rezervare);

    }
}
