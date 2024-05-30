package poker;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combinations {

    public static boolean quads(List<Card> cards) {
        Map<String, Integer> cardCounts = new HashMap<>();

        for (Card card : cards) {
            cardCounts.merge(card.rank, 1, Integer::sum);
        }

        for (int count : cardCounts.values()) {
            if (count == 4) {
                return true;
            }
        }

        return false;
    }

    public static boolean flash(List<Card> cards) {
        Map<CardType, Integer> cardCounts = new HashMap<>();

        for (Card card : cards) {
            cardCounts.merge(card.cardType, 1, Integer::sum);
        }

        for (int count : cardCounts.values()) {
            if (count == 5) {
                return true;
            }
        }
        return false;
    }

    public static boolean fullHouse(List<Card> cards) {
        Map<String, Integer> cardCounts = new HashMap<>();

        for (Card card : cards) {
            cardCounts.merge(card.rank, 1, Integer::sum);
        }

        boolean pairOfThree = false;
        boolean pairOfTwo = false;

        for (int count : cardCounts.values()) {
            if (count == 3) {
                pairOfThree = true;
            } else if (count == 2) {
                pairOfTwo = true;
            }
        }
        return pairOfThree && pairOfTwo;
    }

    public static boolean three(List<Card> cards) {
        Map<String, Integer> cardCounts = new HashMap<>();

        for (Card card : cards) {
            cardCounts.merge(card.rank, 1, Integer::sum);
        }

        for (int count : cardCounts.values()) {
            if (count == 3) {
                return true;
            }
        }

        return false;
    }

    public static boolean twoPairs(List<Card> cards) {
        Map<String, Integer> cardCounts = new HashMap<>();

        for (Card card : cards) {
            cardCounts.merge(card.rank, 1, Integer::sum);
        }

        int pairCount = 0;
        for (int count : cardCounts.values()) {
            if (count == 2) {
                pairCount++;
            }
        }

        return pairCount >= 2;
    }

    public static boolean pair(List<Card> cards) {
        Map<String, Integer> cardCounts = new HashMap<>();

        for (Card card : cards) {
            cardCounts.merge(card.rank, 1, Integer::sum);
        }


        for (int count : cardCounts.values()) {
            if (count == 2) {
                return true;
            }
        }
        return false;
    }

    public static Card seniorCard(List<Card> cards) {
        Card highestCard = cards.get(0);

        for (Card card : cards) {
            if (card.rank.compareTo(highestCard.rank) > 0) {
                highestCard = card;
            }
        }
        return highestCard;
    }

    public static boolean street(List<Card> cards) {
        List<Card> sortedCards = cards.stream().sorted(Comparator.comparing(x -> x.value)).distinct().toList();

        int count = 0;
        for (int i = 0; i < sortedCards.size() - 1; i++) {
            Card card = sortedCards.get(i);
            Card nextCard = sortedCards.get(i + 1);

            if (card.value + 1 == nextCard.value) {
                count += 1;
            }
            if (count == 5) {
                return true;
            }
        }
        return false;
    }

    public static boolean streetFlash(List<Card> cards) {
        return street(cards) && flash(cards);
    }
}

