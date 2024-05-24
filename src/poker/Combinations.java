package poker;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combinations {
    public static int rankValue(String rank) {
        return rank.indexOf(rank);
    }

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
        return pair(cards) && pair(cards);
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
        List<Card> sortedCards = cards.stream().sorted(Comparator.comparingInt(card -> rankValue(card.rank))).distinct().toList();

        int count = 1;
        for (int i = 0; i < sortedCards.size() - 1; i++) {
            int currentRank = rankValue(sortedCards.get(i).rank);
            int nextRank = rankValue(sortedCards.get(i + 1).rank);

            if (currentRank + 1 == nextRank) {
                count++;
                if (count == 5) {
                    return true;
                }
            } else if (currentRank != nextRank) {
                count = 1; // Reset the count if the sequence breaks
            }
        }

        return false;
    }

    public static boolean streetFlash(List<Card> cards) {
        return street(cards) && flash(cards);
    }
}

