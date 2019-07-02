package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int numberOfAttempts = 0;
    private boolean isWin = false;
    private int[] attempts = new int[10];

    public boolean getIsWin() {
        return isWin;
    }

    public void setIsWin(boolean isWin) {
        this.isWin = isWin;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getAttempt() {
//        System.out.println("Массив " + Arrays.toString(attempts));
////        Arrays.fill(attempts, 0, 5, 1);
        System.out.println("Массив " + Arrays.toString(attempts));

//        return Arrays.copyOf(attempts, attempts.length + 1);
        return attempts = Arrays.copyOf(attempts, attempts.length + 1);
    }

    public void setAttempt(int number) {
        this.attempts[numberOfAttempts] = number;
    }
}
