package subiectD.state;

public class Bancomat {
    private Stare stare;
    private Card card;

    public Bancomat() {
        stare = new NuAreCard();
    }

    public void introduceCard(Card cardIntrodus) {
        if (stare instanceof NuAreCard && card == null) {
            card = cardIntrodus;
            stare = new AreCard();
            System.out.println("Card introdus");
        } else {
            System.out.println("Nu se poate introduce cardul");
        }
    }

    public void introducePin(String prin) {
        if (stare instanceof AreCard) {
            System.out.println("Pin introdsu: " + prin);
            stare = new ArePinIntrodus();
        }
    }

    public Stare getStare() {
        return stare;
    }

    public void extrageBani(int suma) {
        if (stare instanceof ArePinIntrodus) {
            if (suma <= card.getSuma()) {
                card.setSuma(card.getSuma() - suma);
                if(card.getSuma() == 0){
                    stare = new NuAreBani();
                    System.out.println("Ai ramas fara bani");
                }else{
                    System.out.println("Mai ai " + card.getSuma());
                }
            }else{
                System.out.println("Sold insuficent");
            }
        }
    }
}
