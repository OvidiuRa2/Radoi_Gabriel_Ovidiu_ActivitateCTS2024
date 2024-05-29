package subiectA.adapter;

public class main {
    public static void main(String[] args) {
        MedicamentAdapter adapter = new MedicamentAdapter(new MedicamentSpital("comp","reteta"));

        adapter.cumparaMedicament();
    }
}
