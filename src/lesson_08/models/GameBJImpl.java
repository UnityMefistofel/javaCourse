package lesson_08.models;

import lesson_08.interfaces.GameBJ;

import java.util.ArrayList;
import java.util.List;

public class GameBJImpl implements GameBJ {
    PlayerImpl [] playersInGame = new PlayerImpl[3];
    DeckOfCardsImpl deckOfCards = new DeckOfCardsImpl();
    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null) {
                playersInGame[i] = player;
                break;
            }
        }
    }

    @Override
    public void giveTwoCardsOnHand() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                playersInGame[i].takeCard(deckOfCards.randomCard());
                playersInGame[i].takeCard(deckOfCards.randomCard());
            }
        }
    }

    @Override
    public void giveOneCardOnHand() {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] != null) {
                while (playersInGame[i].needCard()) {
                    playersInGame[i].takeCard(deckOfCards.randomCard());
                }
            }
        }
    }

    @Override
    public void printWinner() {
        for (PlayerImpl player : playersInGame) {
            if (player != null) {
                if (player.countValuesOfAllCardsOnHand() > 21) {
                    player.setInGame(false);
                }
            }
        }

        if (countPlayersInGame() == 0) {
            System.out.println("победителей нет");
        } else

        if (countPlayersInGame() == 1) {

            for (PlayerImpl player: playersInGame) {
                if (player != null && player.isInGame()) {
                    System.out.println("Победил игрок : "+player.name +
                                       " с результатом: "+player.countValuesOfAllCardsOnHand());
                    player.showCardsOnHand();
                }
            }
        } else {

            int bestValue = 0;
            List<PlayerImpl> bestPlayers = new ArrayList<>();
            for (PlayerImpl player : playersInGame) {
                if (player != null && player.isInGame()) {
                    if (bestValue < player.countValuesOfAllCardsOnHand()) {
                        bestValue = player.countValuesOfAllCardsOnHand();
                        bestPlayers.clear();
                        bestPlayers.add(player);
                    } else if (bestValue == player.countValuesOfAllCardsOnHand()) {
                        bestPlayers.add(player);
                    }
                }
            }

            for (PlayerImpl player: bestPlayers) {
                // if (player != null && player.isInGame() && !player.isCroupier) {
                System.out.println("Победил игрок : "+player.name +
                        " с результатом: "+player.countValuesOfAllCardsOnHand());
                player.showCardsOnHand();

                // }
            }
        }



    }

    public int countPlayersInGame() {
        int countPlayers = 0;
        for (PlayerImpl player: playersInGame) {
            if (player != null && player.isInGame()) {
                countPlayers++;
            }
        }
        return countPlayers;
    }
}
