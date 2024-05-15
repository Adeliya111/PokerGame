package poker;

import java.util.List;

public class HandResolver {
    public static Combination resolved(List<Card> cards) {
        if(Combinations.quads(cards)) {
            return Combination.QUADS;
        }
        if(Combinations.flash(cards)) {
            return Combination.FLASH;
        }
        if(Combinations.fullHouse(cards)) {
            return Combination.FULL_HOUSE;
        }
        if(Combinations.three(cards)) {
            return Combination.THREE;
        }
        if(Combinations.twoPairs(cards)) {
            return Combination.TWO_PAIRS;
        }
        if(Combinations.pair(cards)) {
            return Combination.PAIR;
        }
        if(Combinations.street(cards)) {
            return Combination.STREET;
        }
        if(Combinations.streetFlash(cards)) {
            return Combination.STREET_FLASH;
        }
        return Combination.SENIOR_CARD;
    }
}
