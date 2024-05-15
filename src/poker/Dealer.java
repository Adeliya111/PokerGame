package poker;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
        public List<Card> tableCards = new ArrayList<>();

        private final Cards cards;
        public Dealer(Cards cards) {
            this.cards = cards;
        }

        public void shuffleDeck() {
            cards.shuffle();
        }

        public void dealCard() {
            Card card = cards.getCard();
            tableCards.add(card);
        }

        public List<Card> getTableCards() {
            return tableCards;
        }
}
