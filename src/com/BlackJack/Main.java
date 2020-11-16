package com.BlackJack;

import Card.Card;
import DeckOfCards.DeckOfCards;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Card myCard = new Card("Spade","Ace");

        System.out.println(myCard.getCardRank());

        System.out.println(myCard.getCardSuit());

        DeckOfCards myDeck = new DeckOfCards();

        System.out.println("Current deck size is " + myDeck.currentDeckSize());

        System.out.println("Current pulled card amout is " + myDeck.currentAmountOfPulledCards());

        Card randomCard = myDeck.pullRandomLeaveInDeck();

        System.out.println(randomCard.getCardRank() + " of " + randomCard.getCardSuit());

        System.out.println("Current deck size is " + myDeck.currentDeckSize());

        System.out.println("Current pulled card amount is " + myDeck.currentAmountOfPulledCards());

        randomCard = myDeck.pullRandomRemoveFromDeck();

        System.out.println(randomCard.getCardRank() + " of " + randomCard.getCardSuit());

        System.out.println("Current deck size is " + myDeck.currentDeckSize());

        System.out.println("Current pulled card amount is " + myDeck.currentAmountOfPulledCards());

    }
}
