package poker;

public class Dealer {
    private final Cards cards;
    public Dealer(Cards cards) {
        this.cards = cards;
    }

    public void shuffleDeck() {
        cards.shuffle();
    }

    public Card dealCard() {
        return cards.getCard();
    }
}
