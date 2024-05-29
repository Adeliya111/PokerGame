package poker;

public class Card {
    public final String rank;

    public final CardType cardType;

    public final int value;

    public Card(String rank, CardType cardType, int value) {
        this.rank = rank;
        this.cardType = cardType;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", cardType=" + cardType +
                '}';
    }
}
