package poker;

import java.util.Scanner;

public class PokerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to play?");
        System.out.println("Type yes or no:");

        String command = scanner.nextLine().trim();

        if (command.equalsIgnoreCase("no")) {
            System.out.println("Exiting");
            return;
        }

        while (true) {
            System.out.println("Name first player:");
            String firstName = scanner.nextLine().trim();

            System.out.println("Name second player:");
            String secondName = scanner.nextLine().trim();

            Player first = new Player(firstName);
            Player second = new Player(secondName);

            Deck deck = new Deck();
            deck.preparationCards();
            deck.shuffle();

            Dealer dealer = new Dealer(deck);

            first.clearCards();
            second.clearCards();

            for (int i = 1; i < 3; i++) {
                first.addCard(deck.getCard());
                second.addCard(deck.getCard());
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

            Combination firstCombination = DetermineWinner.determineCombinations(first, dealer);
            Combination secondCombination = DetermineWinner.determineCombinations(second, dealer);

            System.out.println("\nFirst player's combination:");
            System.out.println(firstCombination);
            System.out.println("\nSecond player's combination:");
            System.out.println(secondCombination);

            DetermineWinner.winnerResolver(first, second, firstCombination, secondCombination, firstName, secondName);

            System.out.println("\nDo you want to keep playing?");
            System.out.println("Type yes or no:");

            String play = scanner.nextLine().trim();

            if (play.equalsIgnoreCase("no")) {
                System.out.println("Exiting");
                break;
            }
        }

        scanner.close();
    }
}

