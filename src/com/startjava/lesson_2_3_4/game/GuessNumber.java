package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
    private Player player1;
    private Player player2;



    private int randomNumber;
    private Scanner scanner = new Scanner(System.in);

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void guessNumber() {


        randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber); //Случ число
        init();

        while (!player1.getIsWin() && !player2.getIsWin()) {
            playerInput(player1, randomNumber);

            if (!player1.getIsWin()) {
                playerInput(player2, randomNumber);
            }
            if (player1.getNumberOfAttempts() + player2.getNumberOfAttempts() == 20) {
                System.out.println("У вас закончились попытки");
                break;
            }
        }
        System.out.println(player1.getName() + " Ввел: " + outputArrayWithNumbers(player1.getNumberOfAttempts(), player1.getAttempt()));
        System.out.println(player2.getName() + " Ввел: " + outputArrayWithNumbers(player2.getNumberOfAttempts(), player2.getAttempt()));
    }

    private void init () {

        System.out.println("Массив2 до очистки " + Arrays.toString(player1.getAttempt()));
        System.out.println("Массив2 до очистки " + Arrays.toString(player2.getAttempt()));
//
//        Arrays.fill(player1.getAttempt(), 0, player1.getNumberOfAttempts(), 1);
//
//        Arrays.fill(player2.getAttempt(), 0, 5, 1);
//
////
////
//        System.out.println("Массив2 после очистки " + Arrays.toString(player1.getAttempt()));
//        System.out.println("Массив2 после очистки " + Arrays.toString(player2.getAttempt()));

        player1.setNumberOfAttempts(0);
        player2.setNumberOfAttempts(0);
        player1.setIsWin(false);
        player2.setIsWin(false);
    }

    private String outputArrayWithNumbers(int attempt, int[] arrayOfInputNumbers) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < attempt; i++) {
            res.append(arrayOfInputNumbers[i]).append(" ");
        }
        return res.toString();
    }

    private void playerInput(Player player, int randomNumber) {
        System.out.print(player.getName() + " вводит значение: ");
        determineWinner(player, randomNumber);
    }

    private void determineWinner(Player player, int randomNumber) {
        player.setNumber(scanner.nextInt());

        if (player.getNumber() == randomNumber) {
            player.setAttempt(player.getNumber());
            player.setIsWin(true);
            conclusionWinPlayer(player);
            player.setNumberOfAttempts(player.getNumberOfAttempts() + 1);
        } else {
            player.setAttempt(player.getNumber());
            System.out.println(player.getName() + " не угадал, осталось попыток: " + (9 - player.getNumberOfAttempts()));
            System.out.println(" ");
            player.setNumberOfAttempts(player.getNumberOfAttempts() + 1);
        }
    }

    private void conclusionWinPlayer (Player player) {
        if (player.getIsWin()) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getAttempt()[player.getNumberOfAttempts()] + " с " + (player.getNumberOfAttempts() + 1) + " попытки");
        }
    }
}

