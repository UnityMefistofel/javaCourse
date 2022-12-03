package lesson_08.interfaces;

import lesson_08.models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player);

    void giveTwoCardsOnHand();

    void giveOneCardOnHand();

    void printWinner();
}
