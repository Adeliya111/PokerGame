package poker;

import java.util.ArrayList;
import java.util.List;

public class DetermineWinner {

    public static void winnerResolver(Player first, Player second, Combination firstCombination, Combination secondCombination, String firstName, String secondName) {
        if (firstCombination.compareTo(secondCombination) < 0) {
            System.out.println("\n" + firstName + " wins!");
        } else if (firstCombination.compareTo(secondCombination) > 0) {
            System.out.println("\n" + secondName + " wins!");
        } else {
            Card winCard = first.getBiggestCard();
            Card winCard1 = second.getBiggestCard();
            if (winCard1.value > winCard.value) {
                System.out.println("\n" + secondName + " wins by highest card!");
            } else if (winCard1.value < winCard.value) {
                System.out.println("\n" + firstName + " wins by highest card!");
            } else {
                System.out.println("\nDraw!");
            }
        }
    }

    public static Combination determineCombinations(Player player, Dealer dealer) {
        List<Card> cards = new ArrayList<>();
        cards.addAll(player.cardsList);
        cards.addAll(dealer.getTableCards());
        return HandResolver.resolved(cards);
    }
}
