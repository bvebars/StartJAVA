package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int attempt;
    private boolean isWin;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
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
        return Arrays.copyOf(attempts, attempt);
    }

    public void setAttempts(int number) {
        attempts[attempt] = number;
    }
    public void resetNumbers() {
        Arrays.fill(attempts, 0, attempt, 0);
    }

}

