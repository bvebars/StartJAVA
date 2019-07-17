package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int numberOfAttempts;
    private boolean isWin;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
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

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberOfAttempts);
    }

    public void setAttempts(int number) {
        attempts[numberOfAttempts] = number;
    }
    public void resetNumbers() {
        Arrays.fill(attempts, 0);
    }
}

