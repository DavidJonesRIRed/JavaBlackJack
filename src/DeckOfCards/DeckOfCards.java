package DeckOfCards;

import Card.Card;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards{
    private ArrayList<Card> Deck;
    private ArrayList<Card> cardPulled;
    private Random mRandom;

    private enum Suit {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;
    }

    private enum Rank {
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

    public DeckOfCards() {
        mRandom = new Random();
        cardPulled = new ArrayList<Card>();
        Deck = new ArrayList<Card>(Suit.values().length * Rank.values().length);
        newDeck();
    }

    public void newDeck() {
        cardPulled.clear();
        Deck.clear();
        /* Creating all possible cards... */
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                Deck.add(c);
            }
        }
}
