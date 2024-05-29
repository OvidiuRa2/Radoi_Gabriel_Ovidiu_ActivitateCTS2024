package subiectC.buider;

public class main {
    public static void main(String[] args) {
        Builder builder = new BuilderFacturi();
        Factura factura = builder.adaugaNrPungi(3).adaugaCardFidelitate().build();
        System.out.println(factura);
    }
}
