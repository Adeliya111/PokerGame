package poker;

import java.util.ArrayList;
import java.util.List;

public class PokerRunner {
    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.preparationCards();
        cards.shuffle();


        Player first = new Player("First player");
        Player second = new Player("Second player");

        Dealer dealer = new Dealer(cards);

        for (int i = 1; i < 3; i++) {
            first.addCard(cards.getCard());
            second.addCard(cards.getCard());
        }

        for (int i = 1; i < 6; i++) {
            dealer.dealCard();
        }

        System.out.println("First player's cards:");
        first.showCards();
        System.out.println("\nSecond player's cards:");
        second.showCards();
        System.out.println("\nDealer's cards:");
        dealer.showTableCards();

        Combination firstCombination = determineCombinations(first, dealer);
        Combination secondCombination = determineCombinations(second, dealer);

        System.out.println("\nFirst player's combination :");
        System.out.println(firstCombination);
        System.out.println("\nSecond player's combination :");
        System.out.println(secondCombination);

        if (firstCombination.compareTo(secondCombination) < 0) {
            System.out.println("\nFirst player wins!");
        } else if (firstCombination.compareTo(secondCombination) > 0) {
            System.out.println("\nSecond player wins!");
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
