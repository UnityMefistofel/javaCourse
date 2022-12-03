package lesson_08;

import lesson_08.models.CroupierBJ;
import lesson_08.models.GameBJImpl;
import lesson_08.models.PlayerImpl;

public class Main {
    public static void main(String[] args) {
        // 1. Создать класс игру, в которой у нас происходить игра
        // 2. СОздаем игроков
        // 3. Создаем крупье
        // 4. Добавить игроков и крупье в игру
        // 5. Добавить колоду карт
        // 6. Добавим карты в колоду
        // 7. Раздать каждому игроку по 2 карты на старте
        // 8. Раздавать каждому игрроку по одной карте, пока это требуется
        // 9. Определить победителя


        // 1. Создать класс игру, в которой у нас происходить игра
        // 5. Добавить колоду карт
        // 6. Добавим карты в колоду
        GameBJImpl gameBJ = new GameBJImpl();

        // 2. СОздаем игроков
        PlayerImpl player1 = new PlayerImpl("Вася");
        PlayerImpl player2 = new PlayerImpl("Петя");

        // 3. Создаем крупье
        CroupierBJ croupierBJ = new CroupierBJ("Крупье");


        // 4. Добавить игроков и крупье в игру
        gameBJ.addPlayerInGame(player1);
        gameBJ.addPlayerInGame(player2);
        gameBJ.addPlayerInGame(croupierBJ);



        // 7. Раздать каждому игроку по 2 карты на старте
        gameBJ.giveTwoCardsOnHand();

        // 8. Раздавать каждому игрроку по одной карте, пока это требуется
        gameBJ.giveOneCardOnHand();

        // 9. Определить победителя
        gameBJ.printWinner();
    }
}
