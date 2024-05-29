package subiectB.State;

public class main {
    public static void main(String[] args) {
        Masa masa = new Masa();
        System.out.println(masa.getStare());
        masa.rezervaMasa();
        masa.ocupaMasa();
        System.out.println(masa.getStare());
        masa.rezervaMasa();
        masa.elibereazaMasa();
        masa.rezervaMasa();
    }
}
