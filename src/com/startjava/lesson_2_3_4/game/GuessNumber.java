package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void guessNumber() {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber); //Случ число
        Arrays.fill(player1.getAttempts(), 0, player1.getNumberOfAttempts(), 0);

        player1.setNumberOfAttempts(0);
        player2.setNumberOfAttempts(0);
        player1.setIsWin(false);
        player2.setIsWin(false);

        while (!player1.getIsWin() && !player2.getIsWin()) {
            System.out.print(player1.getName() + " вводит значение: ");
            determineTheWinner(player1, randomNumber);

            if (!player1.getIsWin()) {
                System.out.print(player2.getName() + " вводит значение: ");
                determineTheWinner(player2, randomNumber);
            }
            if (player1.getNumberOfAttempts() + player2.getNumberOfAttempts() == 20) {
                System.out.println("У вас закончились попытки");
                break;
            }
        }
        System.out.println(player1.getName() + " Ввел: " + outputArrayWithNumbers(player1.getNumberOfAttempts(), player1.getAttempts()));
        System.out.println(player2.getName() + " Ввел: " + outputArrayWithNumbers(player2.getNumberOfAttempts(), player2.getAttempts()));
    }

    private String outputArrayWithNumbers(int attempt, int[] arrayOfInputNumbers) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < attempt; i++) {
            res.append(arrayOfInputNumbers[i]).append(" ");
        }
        return res.toString();
    }

    private void determineTheWinner(Player player, int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        player.setNumbersEntered(scanner.nextInt());

        if (player.getNumbersEntered() == randomNumber) {
            player.setAttempts(player.getNumbersEntered());
            player.setIsWin(true);
            numberOfAttempts(player);
            player.setNumberOfAttempts(player.getNumberOfAttempts() + 1);
        } else {
            player.setAttempts(player.getNumbersEntered());
            System.out.println(player.getName() + " не угадал, осталось попыток: " + (9 - player.getNumberOfAttempts()));
            System.out.println(" ");
            player.setNumberOfAttempts(player.getNumberOfAttempts() + 1);
        }
    }

    private void numberOfAttempts(Player player) {
        if (player.getIsWin()) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getAttempts()[player.getNumberOfAttempts()] + " с " + (player.getNumberOfAttempts() + 1) + " попытки");
        }
    }
}

