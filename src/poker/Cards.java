package poker;

import java.util.*;

public class Cards {
    List<String> ranks = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

    List<Integer> values = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);

    public Stack<Card> CardsStack = new Stack<>();


    public void preparationCards() {
        CardsStack.clear();
        CardType[] cardTypes = CardType.values();

        for (CardType cardType : cardTypes) {
            for (int i = 0; i < ranks.size(); i++) {
                String rank = ranks.get(i);
                int value = values.get(i);
                CardsStack.add(new Card(rank, cardType, value));
            }
        }
    }

    public void shuffle() {
        for (int i = 1; i < 6; i++)
            Collections.shuffle(CardsStack);
    }

    public Card getCard() {
        return CardsStack.pop();
    }
}