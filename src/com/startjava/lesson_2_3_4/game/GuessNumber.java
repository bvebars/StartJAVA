package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    private Scanner scanner = new Scanner(System.in);

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void guessNumber() {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber); //Случ число

        //////////
//        player1.setArray(new int[5]);
//        Arrays.fill(player1.getArray(), 1);
//        System.out.println(Arrays.toString(player1.getArray()));
//
//        player1.setArray(new int[3]);
//        Arrays.fill(player1.getArray(), 3);
//        System.out.println(Arrays.toString(player1.getArray()));

        ///////////



        Arrays.fill(player1.getArray(), 0);

        Arrays.fill(player2.getArray(), 0);




        while (player1.getIncNumber() + player2.getIncNumber() <= 10) {
            System.out.print(player1.getName() + " вводит значение: ");
            player1.setNumber(scanner.nextInt());

            if (player1.getNumber() == randomNumber) {

                System.out.println("Ключ " + player1.getIncNumber() + " Значение " + player1.getNumber()); // Удалить
                player1.getArray()[player1.getIncNumber()] = player1.getNumber();
                player1.setIncNumber(player1.getIncNumber() + 1);
//                player1.setArray(new int[player1.getIncNumber()]);
                player1.setWin(true);
                break;
            } else {
                player1.getArray()[player1.getIncNumber()] = player1.getNumber();
                System.out.println(player1.getName() + " не угадал, осталось попыток: " + (9 - (player1.getIncNumber() + player2.getIncNumber())));
                System.out.println(" ");
                player1.setIncNumber(player1.getIncNumber() + 1);
//                Player.incrementNumber();
//                System.out.println(Player.incrementNumber());
            }
            System.out.print(player2.getName() + " вводит значение: ");

            player2.setNumber(scanner.nextInt());

            if (player2.getNumber() == randomNumber) {
                player2.getArray()[player2.getIncNumber()] = player2.getNumber();
                player2.setIncNumber(player2.getIncNumber() + 1);
//                player2.setArray(new int[player2.getIncNumber()]);
                player2.setWin(true);
                break;
            } else {
                player2.getArray()[player2.getIncNumber()] = player2.getNumber();
                System.out.println(player2.getName() + " не угадал, осталось попыток: " + (9 - (player1.getIncNumber() + player2.getIncNumber())));
                System.out.println(" ");
                player2.setIncNumber(player2.getIncNumber() + 1);
//                Player.incrementNumber();
//                System.out.println(Player.incrementNumber());
            }

            if (player1.getIncNumber() + player2.getIncNumber() == 10) {
                System.out.println("У вас закончились попытки");
            }
        }
        System.out.println(player1.getIncNumber() + " ^ " + Arrays.toString(player1.getArray())); // Удалить

        System.out.println(player1.getName() + " Ввел: " + arrayOutput(player1.getIncNumber(), player1.getArray()));
        System.out.println(player2.getName() + " Ввел: " + arrayOutput(player2.getIncNumber(), player2.getArray()));
    }

    private String arrayOutput(int increment, int[] array) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < increment; i++) {
            res.append(array[i]).append(" ");
        }
        return res.toString();
    }

    void incrementTotal() {
        System.out.println("Игрок 1: " + player1.getIncNumber() + " Игрок 2 " + player2.getIncNumber());
        if (player1.isWin()) {
            System.out.println("Игрок " + player1.getName() + " угадал число " +
                    player1.getArray()[player1.getIncNumber() - 1] + " с " + (player1.getIncNumber()) + " попытки");

        } else if (player2.isWin()) {
            System.out.println("Игрок " + player2.getName() + " угадал число " +
                    player2.getArray()[player2.getIncNumber() - 1] + " с " + (player2.getIncNumber()) +  " попытки");
        }
    }
}


