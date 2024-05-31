package test;

import poker.Card;
import poker.CardType;
import poker.Combination;
import poker.HandResolver;

import java.util.List;

public class CombTest {
    public static void main(String[] args) {
        CheckStreet();
        CheckFlash();
        CheckFullHouse();
        CheckQuads();
        CheckStreetFlash();
        CheckThree();
        CheckTwoPairs();
        CheckPair();
    }

    private static void CheckStreet() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("Queen", CardType.DIAMONDS, 12);
        Card card3 = new Card("9", CardType.HEARTS, 9);
        Card card4 = new Card("8", CardType.HEARTS, 8);
        Card card5 = new Card("Jack", CardType.DIAMONDS, 11);

        Card playerCard1 = new Card("10", CardType.DIAMONDS, 10);
        Card playerCard2 = new Card("King", CardType.SPADES, 13);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckFlash() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("Queen", CardType.CLUBS, 12);
        Card card3 = new Card("9", CardType.HEARTS, 9);
        Card card4 = new Card("8", CardType.CLUBS, 8);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("10", CardType.CLUBS, 10);
        Card playerCard2 = new Card("King", CardType.SPADES, 13);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckFullHouse() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("7", CardType.HEARTS, 7);
        Card card3 = new Card("3", CardType.HEARTS, 3);
        Card card4 = new Card("8", CardType.CLUBS, 8);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("7", CardType.SPADES,7);
        Card playerCard2 = new Card("3", CardType.SPADES, 3);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckQuads() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("7", CardType.HEARTS, 7);
        Card card3 = new Card("9", CardType.HEARTS, 9);
        Card card4 = new Card("7", CardType.SPADES, 7);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("7", CardType.DIAMONDS, 7);
        Card playerCard2 = new Card("King", CardType.SPADES, 13);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckStreetFlash() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("5", CardType.CLUBS, 5);
        Card card3 = new Card("Ace", CardType.CLUBS, 14);
        Card card4 = new Card("2", CardType.HEARTS, 2);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("Ace", CardType.CLUBS, 14);
        Card playerCard2 = new Card("King", CardType.SPADES, 13);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckThree() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("7", CardType.HEARTS, 7);
        Card card3 = new Card("5", CardType.HEARTS, 5);
        Card card4 = new Card("8", CardType.CLUBS, 8);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("7", CardType.SPADES, 7);
        Card playerCard2 = new Card("3", CardType.SPADES, 3);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckTwoPairs() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("7", CardType.HEARTS, 7);
        Card card3 = new Card("3", CardType.HEARTS, 3);
        Card card4 = new Card("8", CardType.CLUBS, 8);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("Queen", CardType.SPADES, 12);
        Card playerCard2 = new Card("3", CardType.SPADES, 3);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckPair() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("5", CardType.HEARTS, 5);
        Card card3 = new Card("2", CardType.HEARTS, 2);
        Card card4 = new Card("8", CardType.CLUBS, 8);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("Queen", CardType.SPADES, 12);
        Card playerCard2 = new Card("5", CardType.SPADES, 5);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }

    private static void CheckSeniorCard() {
        Card card1 = new Card("7", CardType.CLUBS, 7);
        Card card2 = new Card("5", CardType.HEARTS, 5);
        Card card3 = new Card("2", CardType.HEARTS, 2);
        Card card4 = new Card("King", CardType.CLUBS,13);
        Card card5 = new Card("Jack", CardType.CLUBS, 11);

        Card playerCard1 = new Card("Ace", CardType.SPADES, 14);
        Card playerCard2 = new Card("5", CardType.SPADES, 5);

        Combination combination = HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));

        System.out.println(combination);
    }
}