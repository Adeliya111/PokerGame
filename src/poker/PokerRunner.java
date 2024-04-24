package poker;

import java.util.List;
import java.util.Random;
import java.util.Stack;

public class PokerRunner {
    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.preparationCards();
        cards.shuffle();

        int getCard = new Random().nextInt(3);

        Stack<Card> CardsStack = cards.getCardStack();


        Player sasha = new Player("Sasha");
        Player karina = new Player("Karina");

        for (int i = 1; i < 6; i++) {
            sasha.addCard(cards.getCard());
            karina.addCard(cards.getCard());
        }

        System.out.println("Sasha's cards:");
        sasha.showCards();
        System.out.println("\nKarina's cards:");
        karina.showCards();
    }
    }

