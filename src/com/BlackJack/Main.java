package com.BlackJack;

import CardGame.Card;
import CardGame.DeckOfCards;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Card myCard = new Card("Spade","Ace");

        System.out.println(myCard.getCardRank());

        System.out.println(myCard.getCardSuit());
        */

        DeckOfCards myDeck = new DeckOfCards();

        System.out.println("Current deck size is " + myDeck.currentDeckSize());

        System.out.println("Current pulled card amount is " + myDeck.currentAmountOfPulledCards());

        Card randomCard = myDeck.pullRandomLeaveInDeck();

        System.out.println(randomCard.getCardRank() + " of " + randomCard.getCardSuit());

        myDeck.searchCardInDeck(randomCard.getCardSuit(), randomCard.getCardRank());

        randomCard = myDeck.pullRandomRemoveFromDeck();

        System.out.println(randomCard.getCardRank() + " of " + randomCard.getCardSuit());

        System.out.println("Current deck size is " + myDeck.currentDeckSize());

        System.out.println("Current pulled card amount is " + myDeck.currentAmountOfPulledCards());

        myDeck.searchCardInDeck(randomCard.getCardSuit(), randomCard.getCardRank());

    }

    //FIXME
    //v0.1 I can instantiate a card with a value and suit - done
    //v0.2 I can instantiate a deck and build it with 52 unique cards. - done
    //v0.3 I can draw a card from the deck. - done
    //v0.4 i should confirm i can not draw the same card twice from a deck. ie the card appears to be removed. - done
    //v0.5 I can detect when the deck is empty.
    //v0.6 I can shuffle the order of the deck. - done
    //v1.0 i can draw two cards from the deck into a hand.
    //v1.1 i can determine the value of the hand based on the values
    //v1.2 i can determine the BlackJack value of the hand.
    //v1.3 I can draw another card into the hand and determine if a Bust has occurred.
    //v1.4 i can end my turn.
    //v2.0 I can have more than one player at the same time.
    //v2.1 Each player will take their turn.
    //v2.2 I have a system that will automate the player process following the dealer rules.
    //v2.3 i can compare the player hand agains the dealer hand and determine if the player has won.
    //v2.4 I can bet points.
    //v2.5 the end game process will award points.
    //additional challenges:
    //v3.0 I can detect BlackJack (face card and an ace)
    //v3.1 if player has BlackJack they gain 2.5x their bet.
    //v3.2 implement the Double feature.
    //v4.0 implement the split feature.

}
