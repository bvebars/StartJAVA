package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    public int incAttempt;
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
        return Arrays.copyOf(attempts, incAttempt);
    }

    public void setAttempts(int number) {
        attempts[incAttempt] = number;
    }
    public void resetNumbers() {
        Arrays.fill(attempts, 0, incAttempt, 1);
    }
}

