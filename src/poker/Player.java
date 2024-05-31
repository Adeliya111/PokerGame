package poker;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;

    List<Card> cardsList = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        if (cardsList.size() == 2) {
            return;
        }
        cardsList.add(card);
    }

    public void showCards() {
        for (Card card : cardsList) {
            System.out.println(card);
        }
    }
    public void clearCards() {
        cardsList.clear();
    }
}
