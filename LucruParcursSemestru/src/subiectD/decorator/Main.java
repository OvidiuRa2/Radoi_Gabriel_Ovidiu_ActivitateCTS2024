package subiectD.decorator;

public class Main {
    public static void main(String[] args) {
        FunctionalitatiCard card = new Card();

        card.platesteFizic(200);

        Decorator cardContactLess =  new CardContactLess(card);

        cardContactLess.plataContactLess(100);

        cardContactLess.platesteFizic(150);
    }
}
