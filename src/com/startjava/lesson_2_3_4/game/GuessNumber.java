package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int incrementPlayerOne = 0;
    private int incrementPlayerTwo = 0;

    private Player player1;
    private Player player2;

    private Scanner scanner = new Scanner(System.in);

    private int[] arrPlayerOne = new int[5];
    private int[] arrPlayerTwo = new int[5];

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void guessNumber() {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber); //Случ число

        Arrays.fill(arrPlayerOne, 0);
        Arrays.fill(arrPlayerTwo, 0);

        incrementPlayerOne = 0;
        incrementPlayerTwo = 0;

        while (incrementPlayerOne + incrementPlayerTwo < 10) {
            System.out.print(player1.getName() + " вводит значение: ");
            player1.setNumber(scanner.nextInt());

            if (player1.getNumber() == randomNumber) {
                arrPlayerOne[incrementPlayerOne] = player1.getNumber();
                incrementPlayerOne++;
                player1.setWin(true);
                break;
            } else {
                arrPlayerOne[incrementPlayerOne] = player1.getNumber();
                System.out.println(player1.getName() + " не угадал, осталось попыток: " + (9 - (incrementPlayerOne + incrementPlayerTwo)));
                System.out.println(" ");
                incrementPlayerOne++;
            }
            System.out.print(player2.getName() + " вводит значение: ");

            player2.setNumber(scanner.nextInt());

            if (player2.getNumber() == randomNumber) {
                arrPlayerTwo[incrementPlayerTwo] = player2.getNumber();
                incrementPlayerTwo++;
                player2.setWin(true);
                break;
            } else {
                arrPlayerTwo[incrementPlayerTwo] = player2.getNumber();
                System.out.println(player2.getName() + " не угадал, осталось попыток: " + (9 - (incrementPlayerOne + incrementPlayerTwo)));
                System.out.println(" ");
                incrementPlayerTwo++;
            }

            if (incrementPlayerOne + incrementPlayerTwo == 10) {
                System.out.println("У вас закончились попытки");
            }
        }
        System.out.println(player1.getName() + " Ввел: " + arrayOutput(incrementPlayerOne, arrPlayerOne));
        System.out.println(player2.getName() + " Ввел: " + arrayOutput(incrementPlayerTwo, arrPlayerTwo));
    }

    private String arrayOutput(int increment, int[] array) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < increment; i++) {
            res.append(array[i]).append(" ");
        }
        return res.toString();
    }

    void incrementTotal() {
        if (player1.getWin()) {
            System.out.println("Игрок " + player1.getName() + " угадал число " +
                    arrPlayerOne[incrementPlayerOne - 1] + " с " + incrementPlayerOne + " попытки");

        } else if (player2.getWin()) {
            System.out.println("Игрок " + player2.getName() + " угадал число " +
                    arrPlayerTwo[incrementPlayerTwo - 1] + " с " + incrementPlayerTwo + " попытки");
        }
    }
}


