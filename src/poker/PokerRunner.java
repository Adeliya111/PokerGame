package poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cards cards = new Cards();
        cards.preparationCards();
        cards.shuffle();

        System.out.println("Do you want to play?");
        System.out.println("Type yes or no?");

        String command = scanner.nextLine().trim();

        if (command.equalsIgnoreCase("no")) {
            System.out.println("Exiting");
            return;
        }

        System.out.println("Name first player");
        String firstName = scanner.nextLine().trim();

        System.out.println("Name second player");
        String secondName = scanner.nextLine().trim();


        Player first = new Player(firstName);
        Player second = new Player(secondName);

        Dealer dealer = new Dealer(cards);

        for (int i = 1; i < 3; i++) {
            first.addCard(cards.getCard());
            second.addCard(cards.getCard());
        }

        for (int i = 1; i < 6; i++) {
            dealer.dealCard();
        }

        System.out.println(firstName + "'s cards:");
        first.showCards();
        System.out.println(secondName + "'s cards:");
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
            System.out.println("\n" + firstName + " wins!");
        } else if (firstCombination.compareTo(secondCombination) > 0) {
            System.out.println("\n" + secondName + " wins!");
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
