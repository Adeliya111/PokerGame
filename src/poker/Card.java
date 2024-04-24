package poker;

public class Card {
    public final String rank;

    public final CardType cardType;

    public Card(String rank, CardType cardType) {
        this.rank = rank;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                '}';
    }

}
