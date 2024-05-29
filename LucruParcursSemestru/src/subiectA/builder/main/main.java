package subiectA.builder.main;

import subiectA.builder.clase.ConcreteBuilder;
import subiectA.builder.clase.Pacient;

public class main {
    public static void main(String[] args) {
        Pacient pacient = new ConcreteBuilder("Cristinel").adaugaPapuci().build();

        System.out.println(pacient);
    }
}
