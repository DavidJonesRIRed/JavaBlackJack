package Card;

import DeckOfCards.DeckOfCards;

public class Card {

    private String cardSuit;
    private String cardRank;

    public Card(String newSuit, String newRank) {
        this.cardSuit = newSuit;
        this.cardRank = newRank;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardRank() {
        return cardRank;
    }

}
