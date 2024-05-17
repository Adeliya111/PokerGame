package poker;

import java.util.List;

public class HandResolver {
    public static Combination resolved(List<Card> cards) {
        if(Combinations.streetFlash(cards)) {
            return Combination.STREET_FLASH;
        }
        if(Combinations.quads(cards)) {
            return Combination.QUADS;
        }
        if(Combinations.fullHouse(cards)) {
            return Combination.FULL_HOUSE;
        }
        if(Combinations.flash(cards)) {
            return Combination.FLASH;
        }
        if(Combinations.street(cards)) {
            return Combination.STREET;
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
        return Combination.SENIOR_CARD;
    }
}
