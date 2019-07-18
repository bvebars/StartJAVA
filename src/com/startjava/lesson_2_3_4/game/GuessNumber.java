package com.startjava.lesson_2_3_4.game;

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
        init();
        System.out.println(randomNumber); //Случ число

        while (!player1.getIsWin() && !player2.getIsWin()) {
            inputNumber(player1);

            if (!player1.getIsWin()) {
                inputNumber(player2);
            }
            if (player1.incAttempt + player2.incAttempt == 20) {
                System.out.println("У вас закончились попытки");
                break;
            }
        }
        System.out.println(player1.getName() + " Ввел: " + showAttempts(player1));
        System.out.println(player2.getName() + " Ввел: " + showAttempts(player2));
    }

    private void init() {
        player1.resetNumbers();
        player2.resetNumbers();
        randomNumber = (int) (Math.random() * 101);
        player1.incAttempt = 0;
        player2.incAttempt = 0;
        player1.setIsWin(false);
        player2.setIsWin(false);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " вводит значение: ");
        player.setNumber(scanner.nextInt());
        player.setAttempts(player.getNumber());
        determineWinner(player);
    }

    private void determineWinner(Player player) {
        if (player.getNumber() == randomNumber) {
            player.setIsWin(true);
            conclusionWinPlayer(player);
            player.incAttempt++;
        } else {
            player.setAttempts(player.getNumber());
            System.out.println(player.getName() + " не угадал, осталось попыток: " + (9 - player.incAttempt));
            System.out.println(" ");
            player.incAttempt++;
        }
    }

    private void conclusionWinPlayer(Player player) {
        if (player.getIsWin()) {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber() + " с " + (player.incAttempt + 1) + " попытки");
        }
    }

    private String showAttempts(Player player) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < player.incAttempt; i++) {
            res.append(player.getAttempts()[i]).append(" ");
        }
        return res.toString();
    }
}
