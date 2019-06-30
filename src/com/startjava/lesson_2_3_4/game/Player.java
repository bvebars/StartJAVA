package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;

    private int numberOfAttempts;
    private boolean isWin;
    private int numbersEntered;
    private int [] arraysNumbers = new int[10];

    public int[] getArraysNumbers() {
        return arraysNumbers;
    }

    public void setArraysNumbers(int[] arraysNumbers) {
        this.arraysNumbers = arraysNumbers;
    }

    public int getNumbersEntered() {
        return numbersEntered;
    }

    public void setNumbersEntered(int numbersEntered) {
        this.numbersEntered = numbersEntered;
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

    public String getName() {
        return name;
    }
}
