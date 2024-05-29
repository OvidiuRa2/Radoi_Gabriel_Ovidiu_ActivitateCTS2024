package subiectD.state;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat();
        bancomat.introduceCard(new Card(200));
        bancomat.introducePin("123");
        bancomat.extrageBani(100);
        bancomat.extrageBani(100);
        System.out.println(bancomat.getStare());
    }
}
