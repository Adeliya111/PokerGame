package poker;

import java.util.List;

public class HandResolver {
    public static Combination resolved(List<Card> cards) {
        if(CombinationResolver.streetFlash(cards)) {
            return Combination.STREET_FLASH;
        }
        if(CombinationResolver.quads(cards)) {
            return Combination.QUADS;
        }
        if(CombinationResolver.fullHouse(cards)) {
            return Combination.FULL_HOUSE;
        }
        if(CombinationResolver.flash(cards)) {
            return Combination.FLASH;
        }
        if(CombinationResolver.street(cards)) {
            return Combination.STREET;
        }
        if(CombinationResolver.three(cards)) {
            return Combination.THREE;
        }
        if(CombinationResolver.twoPairs(cards)) {
            return Combination.TWO_PAIRS;
        }
        if(CombinationResolver.pair(cards)) {
            return Combination.PAIR;
        }
        return Combination.SENIOR_CARD;
    }
}
