package poker;

import java.util.*;

public class Cards {
    List<String> ranks = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

    public Stack<Card> CardsStack = new Stack<>();


    public void preparationCards() {
        CardsStack.clear();
        CardType[] cardTypes = CardType.values();

        for (String rank : ranks) {
            for (CardType cardType : cardTypes) {
                CardsStack.add(new Card(rank, cardType));
            }
        }
    }

    public void shuffle() {
        for(int i = 1; i < 6; i++)
            Collections.shuffle(CardsStack);
    }

    public Card getCard() {
        return CardsStack.pop();
    }

    public Stack<Card> getCardStack() {
        return CardsStack;
    }
}