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
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber); //Случ число

        Arrays.fill(player1.getArray(), 0, player1.getIncNumber(), 0);
        Arrays.fill(player2.getArray(), 0, player2.getIncNumber(), 0);
        player1.setIncNumber(0);
        player2.setIncNumber(0);
        player1.setIsWin(false);
        player2.setIsWin(false);
        int[] array1 = player1.getArray();
        int[] array2 = player2.getArray();

        while (player1.getIncNumber() + player2.getIncNumber() < 10) {
            System.out.print(player1.getName() + " вводит значение: ");
            player1.setNumber(scanner.nextInt());

            if (player1.getNumber() == randomNumber) {
//                player1.getArray()[player1.getIncNumber()] = player1.getNumber();
                addInEndArray(player1.getNumber(), array1);
                player1.setIncNumber(player1.getIncNumber() + 1);
                player1.setIsWin(true);

                System.out.println(Arrays.toString(array1));

                break;
            } else {
//                player1.getArray()[player1.getIncNumber()] = player1.getNumber();
                addInEndArray(player1.getNumber(), array1);
                System.out.println(player1.getName() + " не угадал, осталось попыток: " + (9 - (player1.getIncNumber() + player2.getIncNumber())));
                System.out.println(" ");
                player1.setIncNumber(player1.getIncNumber() + 1);

                System.out.println(Arrays.toString(array1));

            }
            System.out.print(player2.getName() + " вводит значение: ");
            player2.setNumber(scanner.nextInt());

            if (player2.getNumber() == randomNumber) {
//                player2.getArray()[player2.getIncNumber()] = player2.getNumber();
                addInEndArray(player2.getNumber(), array2);
                player2.setIncNumber(player2.getIncNumber() + 1);
                player2.setIsWin(true);
                break;
            } else {
//                player2.getArray()[player2.getIncNumber()] = player2.getNumber();
                addInEndArray(player2.getNumber(), array2);
                System.out.println(player2.getName() + " не угадал, осталось попыток: " + (9 - (player1.getIncNumber() + player2.getIncNumber())));
                System.out.println(" ");
                player2.setIncNumber(player2.getIncNumber() + 1);
            }

            if (player1.getIncNumber() + player2.getIncNumber() == 10) {
                System.out.println("У вас закончились попытки");
            }
        }

        player1.setArray(array1);
        player2.setArray(array2);


        System.out.println(Arrays.toString(array2));

        System.out.println(player1.getName() + " Ввел: " + OutputNumbersNamedByPlayer(player1.getIncNumber(), player1.getArray()));
        System.out.println(player2.getName() + " Ввел: " + OutputNumbersNamedByPlayer(player2.getIncNumber(), player2.getArray()));
    }

    private String OutputNumbersNamedByPlayer(int increment, int[] array) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < increment; i++) {
            res.append(array[i]).append(" ");
        }
        return res.toString();
    }

    void incrementTotal() {
        if (player1.getIsWin()) {
            System.out.println("Игрок " + player1.getName() + " угадал число " +
                    player1.getArray()[player1.getIncNumber() - 1] + " с " + (player1.getIncNumber()) + " попытки");

        } else if (player2.getIsWin()) {
            System.out.println("Игрок " + player2.getName() + " угадал число " +
                    player2.getArray()[player2.getIncNumber() - 1] + " с " + (player2.getIncNumber()) + " попытки");
        }
    }


    private void addInEndArray(int arrayOfValuesReceived, int[] arr) {

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = arrayOfValuesReceived;
    }
}


