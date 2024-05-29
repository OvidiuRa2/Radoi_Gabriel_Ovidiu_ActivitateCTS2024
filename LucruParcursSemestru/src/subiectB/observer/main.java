package subiectB.observer;

public class main {
    public static void main(String[] args) {
        Observabil restaurnat = new Restaurant();
        Client client = new Client("andrei");
        restaurnat.abonareObservabil(client);
        restaurnat.abonareObservabil(new Client("mihai"));

        restaurnat.notificareMeniuNou();
        restaurnat.dezabonareObservabil(client);
        restaurnat.notificareMeniuNou();
    }
}
