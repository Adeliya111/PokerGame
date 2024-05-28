package test;

import poker.Card;
import poker.CardType;
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
        CheckSeniorCard();
    }

    private static void CheckStreet() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("Queen", CardType.DIAMONDS);
        Card card3 = new Card("9", CardType.HEARTS);
        Card card4 = new Card("8", CardType.HEARTS);
        Card card5 = new Card("Jack", CardType.DIAMONDS);

        Card playerCard1 = new Card("10", CardType.DIAMONDS);
        Card playerCard2 = new Card("King", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckFlash() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("Queen", CardType.CLUBS);
        Card card3 = new Card("9", CardType.HEARTS);
        Card card4 = new Card("8", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("10", CardType.CLUBS);
        Card playerCard2 = new Card("King", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckFullHouse() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("7", CardType.HEARTS);
        Card card3 = new Card("3", CardType.HEARTS);
        Card card4 = new Card("8", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("7", CardType.SPADES);
        Card playerCard2 = new Card("3", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckQuads() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("Queen", CardType.CLUBS);
        Card card3 = new Card("9", CardType.HEARTS);
        Card card4 = new Card("8", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("10", CardType.CLUBS);
        Card playerCard2 = new Card("King", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckStreetFlash() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("Queen", CardType.DIAMONDS);
        Card card3 = new Card("9", CardType.CLUBS);
        Card card4 = new Card("8", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("10", CardType.CLUBS);
        Card playerCard2 = new Card("King", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckThree() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("7", CardType.HEARTS);
        Card card3 = new Card("5", CardType.HEARTS);
        Card card4 = new Card("8", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("7", CardType.SPADES);
        Card playerCard2 = new Card("3", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckTwoPairs() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("7", CardType.HEARTS);
        Card card3 = new Card("3", CardType.HEARTS);
        Card card4 = new Card("8", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("Queen", CardType.SPADES);
        Card playerCard2 = new Card("3", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckPair() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("5", CardType.HEARTS);
        Card card3 = new Card("2", CardType.HEARTS);
        Card card4 = new Card("8", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("Queen", CardType.SPADES);
        Card playerCard2 = new Card("5", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }

    private static void CheckSeniorCard() {
        Card card1 = new Card("7", CardType.CLUBS);
        Card card2 = new Card("5", CardType.HEARTS);
        Card card3 = new Card("2", CardType.HEARTS);
        Card card4 = new Card("King", CardType.CLUBS);
        Card card5 = new Card("Jack", CardType.CLUBS);

        Card playerCard1 = new Card("Ace", CardType.SPADES);
        Card playerCard2 = new Card("5", CardType.SPADES);

        HandResolver.resolved(List.of(card1, card2, card3, card4, card5, playerCard1, playerCard2));
    }
}
