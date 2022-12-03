package lesson_08.models;

import lesson_08.interfaces.Card;
import lesson_08.interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {
    // fields
    String name;
    Card [] cardsOnHand = new Card[100];
    boolean inGame = true;
    boolean isCroupier = false;

    // constructor
    public PlayerImpl(String name){
        this.name = name;
    }

    public PlayerImpl(){}

    // methods
    @Override
    public void takeCard(Card card) {
        for (int i = 0; i < cardsOnHand.length; i++) {
            if (cardsOnHand[i] == null) {
                cardsOnHand[i] = card;
                break;
            }
        }
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int count = 0;
        for (Card c : cardsOnHand) {
            if (c != null) {
                count += c.getValue();
            }

        }
        return count;
    }

    @Override
    public boolean needCard() {
        System.out.println("---------Ваши карты---------------");
        showCardsOnHand();
        System.out.println("Нужна ли вам еще одна карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        for (Card card : cardsOnHand) {
            if (card != null) {
                card.printCard();
            }
        }
    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }


    public boolean isCroupier() {
        return this.isCroupier;
    }

    public void setCroupier(boolean croupier) {
        isCroupier = croupier;
    }
}
