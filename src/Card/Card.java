package Card;

public class Card {
    public Card(){

    }

    //variables
    protected enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;
    }

    protected enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
    EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE;
    }

    private Suit cardSuite;
    private Rank cardRank;

    public Card(Suit newSuite, Rank newRank) {
        this.cardSuite = newSuite;
        this.cardRank = newRank;
    }

    public Suit getSuit() {
        return cardSuite;
    }

    public Rank getRank() {
        return cardRank;
    }

}
