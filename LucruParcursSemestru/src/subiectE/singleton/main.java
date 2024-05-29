package subiectE.singleton;

public class main {
    public static void main(String[] args) {
        NationaleRegistry nationaleRegistry = NationaleRegistry.getInstance();
        nationaleRegistry.adaugaNationala(23,"Romania");
        nationaleRegistry.adaugaNationala(23,"Romania");
        nationaleRegistry.adaugaNationala(25,"ech");
        System.out.println(nationaleRegistry);
        System.out.println(NationaleRegistry.getInstance());

    }
}
