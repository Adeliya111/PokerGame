package poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class PokerRunner {
    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.preparationCards();
        cards.shuffle();

        int getCard = new Random().nextInt(3);


        Player sasha = new Player("Sasha");
        Player karina = new Player("Karina");

        Dealer dealer = new Dealer(cards);

        for (int i = 1; i < 3; i++) {
            sasha.addCard(cards.getCard());
            karina.addCard(cards.getCard());
        }

        for (int i = 1; i < 6; i++) {
            dealer.dealCard();
        }

        System.out.println("Sasha's cards:");
        sasha.showCards();
        System.out.println("\nKarina's cards:");
        karina.showCards();
        System.out.println("\nDealer's cards:");
        dealer.showTableCards();

        Combination sashaCombination = determineCombinations(sasha, dealer);
        Combination karinaCombination = determineCombinations(karina, dealer);

        System.out.println("\nSasha's combination :");
        System.out.println(sashaCombination);
        System.out.println("\nKarina's combination :");
        System.out.println(karinaCombination);

        if (sashaCombination.compareTo(karinaCombination) > 0) {
            System.out.println("\nSasha wins!");
        } else if (sashaCombination.compareTo(karinaCombination) < 0) {
            System.out.println("\nKarina wins!");
        } else {
            System.out.println("\nDraw!");
        }
    }
    private static Combination determineCombinations(Player player, Dealer dealer){
        List<Card> cards = new ArrayList<>();
        cards.addAll(player.cardsList);
        cards.addAll(dealer.getTableCards());
        return HandResolver.resolved(cards);
    }
}
