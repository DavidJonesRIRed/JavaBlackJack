package Card;

import DeckOfCards.DeckOfCards;

public class Card {

    //variables
    private enum Suit{

    }

    private enum Rank {
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
