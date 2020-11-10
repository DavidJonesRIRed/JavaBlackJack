package DeckOfCards;

import Card.Card;

import java.util.ArrayList;
import java.util.Random;

public class DeckOfCards extends Card{
    private ArrayList<Card> Deck;
    private ArrayList<Card> CardPulled;
    private Random mRandom;

    public DeckofCards() {
        mRandom = new Random();
        CardPulled = new ArrayList<Card>();
        Deck = new ArrayList<Card>(Suit.values().length * Rank.values().length);
        //reset();
    }
}
