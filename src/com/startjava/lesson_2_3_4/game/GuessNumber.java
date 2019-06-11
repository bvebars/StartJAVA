package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessNumber() {
        int randomNumber = (int) (Math.random() * 101);
        System.out.println(randomNumber); //Случ число

        while (true) {
            System.out.print(player1.getName() + " вводит значение: ");
            player1.setNumber(scanner.nextInt());

            if (player1.getNumber() == randomNumber) {
                System.out.println(player1.getName() + " угадал ");
                player1.incrementTotal(); //Подсчет общего кол-во побед (Отсебятина)
                break;
            } else {
                System.out.println(player1.getName() + " не угадал");
                System.out.println(" ");
            }
            System.out.print(player2.getName() + " вводит значение: ");
            player2.setNumber(scanner.nextInt());

            if (player2.getNumber() == randomNumber) {
                System.out.println(player2.getName() + " угадал");
                player2.incrementTotal(); //Подсчет общего кол-во побед (Отсебятина)
                break;
            } else {
                System.out.println(player2.getName() + " не угадал");
                System.out.println(" ");
            }
        }
    }

    public void incrementTotal() {
        while (true) {
            if (player1.getTotal() > player2.getTotal()) {
                System.out.println("Выйграл " + player1.getName() + " со счетом " + player1.getTotal() + " : " + player2.getTotal());
            } else if (player1.getTotal() < player2.getTotal()) {
                System.out.println("Выйграл " + player2.getName() + " со счетом " + player2.getTotal() + " : " + player1.getTotal());
            } else {
                System.out.println("Ничья");
            }
            break;
        }
    }
}


