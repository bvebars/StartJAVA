package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int numbersEntered;
    private int numberOfAttempts = 0;
    private boolean isWin = false;
    private int[] attempts = new int[10];

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, attempts.length + 1);
    }

    public void setAttempts(int number) {
        this.attempts[numberOfAttempts] = number;
    }

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

    public int getNumbersEntered() {
        return numbersEntered;
    }

    public void setNumbersEntered(int numbersEntered) {
        this.numbersEntered = numbersEntered;
    }
}
