public class Card {
    private final Character suit;
    private final Character rank;



    public Card( Character rank,Character suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public Character suit() {
        return suit;
    }

    public Character rank() {
        return rank;
    }
}
