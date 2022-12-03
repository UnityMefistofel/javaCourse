package lesson_08.models;

import lesson_08.interfaces.Card;
import lesson_08.interfaces.DeckOfCards;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardsImpl implements DeckOfCards {
    // fields
    //Card [] cards = new Card[52];
    List<Card> cards = new ArrayList<>();


    //constructor

    public DeckOfCardsImpl() {
        final String[] SUITS = {"♣","♥","♠","♦"};
        final String[] TYPES = {"2","3","4","5","6","7","8","9","10","В","Д","К","Т"};
        final int[] VALUES = {2,3,4,5,6,7,8,9,10,10,10,10,11};

        for (int i = 0; i < TYPES.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                cards.add(new CardImpl(TYPES[i]+SUITS[j], VALUES[i]));
            }
        }
    }


    // methods
    @Override
    public Card randomCard() {
        int randInt = ThreadLocalRandom.current().nextInt(0,cards.size()-1);
        Card currCard = cards.get(randInt);
        cards.remove(randInt);
        return currCard;
    }
}
