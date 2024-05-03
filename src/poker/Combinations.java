package poker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combinations {

    public static boolean Quads(List<Card> cards) {
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

    public static boolean Flash(List<Card> cards) {
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

    public static boolean FullHouse(List<Card> cards) {
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

    public static boolean Three(List<Card> cards) {
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

    public static boolean TwoPairs(List<Card> cards) {
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
                if (count == 2 && pairOfTwo == true && count1 != count) {
                    pairOfTwo1 = true;
                }
            }
        }
        return pairOfTwo1 && pairOfTwo;
    }
        public static boolean Pair(List<Card> cards) {
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

    public static boolean SeniorCard(List<Card> cards) {
        Card highestCard = cards.get(0);

        for (Card card : cards) {
            if (card.rank.compareTo(highestCard.rank) > 0) {
                highestCard = card;
            }
        }
        return false;
    }
public static boolean Street(List<Card> cards) {
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

    //public static boolean StreetFlash(List<Cards> cards) {
    //   Map<CardType, Integer> cardCounts = new HashMap<>();

        //for (Cards card : cards) {
            //cardCounts.merge(card.cardType, 1, Integer::sum);
        //}

        //int a = 0;
        //for (int count : cardCounts.values()) {
            //if (count == 5) {
               //a = 1;
            //}
        //}

        //int b = 0;
        //Map<String, Integer> cardCounts1 = new HashMap<>();

        //for (Cards card : cards) {
            //cardCounts1.merge(card.rank, 1, Integer::sum);
        //}

        //int consecutiveRanks = 0;
        //for (String rank : cardCounts1.keySet()) {
            //if (cardCounts1.containsKey(rank)) {
                //consecutiveRanks++;
                //if (consecutiveRanks == 5) {
                    //b = 1;
                //}
            //}
        //}
        //if (a == 1&& b == 1) {
            //return true;
        //}
        //return false;
    //}
}
