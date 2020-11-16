package CardGame;

import CardGame.Card;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.stream.Collectors;

public class DeckOfCards{
    //variables
    private ArrayList<Card> Deck;
    private ArrayList<Card> cardPulled;
    private Random deckRandomizer;
    private String[] deckSuit = {
            "SPADES",
            "HEARTS",
            "DIAMONDS",
            "CLUBS"
    };
    private String[] deckRank ={
            "TWO",
            "THREE",
            "FOUR",
            "FIVE",
            "SIX",
            "SEVEN",
            "EIGHT",
            "NINE",
            "TEN",
            "JACK",
            "QUEEN",
            "KING",
            "ACE"
    };

    //methods
    public DeckOfCards() {
        deckRandomizer = new Random();
        cardPulled = new ArrayList<Card>();
        Deck = new ArrayList<Card>(deckSuit.length * deckRank.length);
        newDeck();
    }

    public void newDeck() {
        cardPulled.clear();
        Deck.clear();
        /* Creating all possible cards... */
        for (String s : deckSuit) {
            for (String r : deckRank) {
                Card c = new Card(s, r);
                Deck.add(c);
            }
        }
    }

    public int randomizeIntForDeck(int min, int max) {
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = deckRandomizer.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Card pullRandomRemoveFromDeck() {
        Card result = Deck.remove(randomizeIntForDeck(0, Deck.size() - 1));
        if (result != null)
            cardPulled.add(result);
        return result;
    }

    public Card pullRandomLeaveInDeck() {
        Card result = Deck.get(randomizeIntForDeck(0, Deck.size() - 1));
        return result;
    }

    public int currentDeckSize(){
        int result = Deck.size();

        return result;
    }

    public int currentAmountOfPulledCards(){
        int result = cardPulled.size();

        return result;
    }

    public void shuffleDeck(){
        Collections.shuffle(Deck);
    }

    public void shufflePulledDeck(){
        Collections.shuffle(cardPulled);
    }

    public ArrayList<Card> searchCardInDeckBySuit(String searchSuit){
        ArrayList<Card> result = Deck.stream()
                .filter(item-> item.cardSuit.contains(searchSuit))
                .collect(Collectors.toCollection(ArrayList::new));

        result.forEach(System.out::println);
    }
}
