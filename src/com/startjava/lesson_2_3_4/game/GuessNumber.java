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

    public void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber); //Случ число

        Arrays.fill(player1.getArraysNumbers(), 0, player1.getNumberOfAttempts(), 0);
        Arrays.fill(player2.getArraysNumbers(), 0, player2.getNumberOfAttempts(), 0);

        player1.setNumberOfAttempts(0);
        player2.setNumberOfAttempts(0);
        player1.setIsWin(false);
        player2.setIsWin(false);

        while (player1.getNumberOfAttempts() + player2.getNumberOfAttempts() < 10) {
            System.out.print(player1.getName() + " вводит значение: ");
            player1.setNumbersEntered(scanner.nextInt());

            if (player1.getNumbersEntered() == randomNumber) {
                player1.getArraysNumbers()[player1.getNumberOfAttempts()] = player1.getNumbersEntered();
                player1.setArraysNumbers(Arrays.copyOf(player1.getArraysNumbers(), player1.getArraysNumbers().length + 1));
                player1.setNumberOfAttempts(player1.getNumberOfAttempts() + 1);
                player1.setIsWin(true);
                break;

            } else {
                System.out.println(player1.getNumbersEntered() + " не угадал, осталось попыток: " + (9 - player1.getNumberOfAttempts()));
                System.out.println(" ");

                player1.getArraysNumbers()[player1.getNumberOfAttempts()] = player1.getNumbersEntered();
                player1.setArraysNumbers(Arrays.copyOf(player1.getArraysNumbers(), player1.getArraysNumbers().length + 1));
                player1.setNumberOfAttempts(player1.getNumberOfAttempts() + 1);
            }

            System.out.print(player2.getName() + " вводит значение: ");
            player2.setNumbersEntered(scanner.nextInt());

            if (player1.getNumbersEntered() == randomNumber) {
                player2.getArraysNumbers()[player2.getNumberOfAttempts()] = player2.getNumbersEntered();
                player2.setArraysNumbers(Arrays.copyOf(player2.getArraysNumbers(), player2.getArraysNumbers().length + 1));
                player2.setNumberOfAttempts(player2.getNumberOfAttempts() + 1);
                player1.setIsWin(true);
                break;

            } else {
                System.out.println(player2.getNumbersEntered() + " не угадал, осталось попыток: " + (9 - player2.getNumberOfAttempts()));
                System.out.println(" ");

                player2.getArraysNumbers()[player2.getNumberOfAttempts()] = player2.getNumbersEntered();
                player2.setArraysNumbers(Arrays.copyOf(player2.getArraysNumbers(), player2.getArraysNumbers().length + 1));
                player2.setNumberOfAttempts(player2.getNumberOfAttempts() + 1);
            }
        }
        System.out.println(player1.getName() + " Ввел: " + OutputNumbersNamedByPlayer(player1.getNumberOfAttempts(), player1.getArraysNumbers()));
        System.out.println(player2.getName() + " Ввел: " + OutputNumbersNamedByPlayer(player2.getNumberOfAttempts(), player2.getArraysNumbers()));
    }

    private String OutputNumbersNamedByPlayer(int increment, int[] array) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < increment; i++) {
            res.append(array[i]).append(" ");
        }
        return res.toString();
    }

   public void incrementTotal() {
        if (player1.getIsWin()) {
            System.out.println("Игрок " + player1.getName() + " угадал число " +
                    player1.getArraysNumbers()[player1.getNumberOfAttempts() - 1] + " с " + (player1.getNumberOfAttempts()) + " попытки");

        } else if (player2.getIsWin()) {
            System.out.println("Игрок " + player2.getName() + " угадал число " +
                    player2.getArraysNumbers()[player2.getNumberOfAttempts() - 1] + " с " + (player2.getNumberOfAttempts()) + " попытки");
        }
    }
}


