package poker;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
        public List<Card> tableCards = new ArrayList<>();

        private final Deck deck;
        public Dealer(Deck deck) {
            this.deck = deck;
        }

        public void dealCard() {
            Card card = deck.getCard();
            tableCards.add(card);
        }

        public void showTableCards() {
            System.out.println(tableCards);
        }

        public List<Card> getTableCards() {
            return tableCards;
        }
}
