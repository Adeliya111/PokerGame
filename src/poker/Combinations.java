package poker;

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

        boolean pairOfTwo = false;
        boolean pairOfTwo1 = false;

        for (int count : cardCounts.values()) {
            if (count == 2) {
                pairOfTwo = true;
            }
            for (int count1 : cardCounts.values()) {
                if (count == 2 && pairOfTwo && count1 != count) {
                    pairOfTwo1 = true;
                }
            }
        }
        return pairOfTwo1 && pairOfTwo;
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

    public static boolean seniorCard(List<Card> cards) {
        Card highestCard = cards.get(0);

        for (Card card : cards) {
            if (card.rank.compareTo(highestCard.rank) > 0) {
                highestCard = card;
            }
        }
        return false;
    }

    public static boolean street(List<Card> cards) {
        Map<String, Integer> cardCounts = new HashMap<>();

        for (Card card : cards) {
            cardCounts.merge(card.rank, 1, Integer::sum);
        }

        int consecutiveRanks = 0;
        for (String rank : cardCounts.keySet()) {
            if (cardCounts.containsKey(rank)) {
                consecutiveRanks++;
                if (consecutiveRanks == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean StreetFlash(List<Card> cards) {
        street(cards);
        flash(cards);
        return true;
    }
}

