package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int incNumber = 0;
    private boolean isWin;

     boolean getIsWin() {
        return isWin;
    }

     void setIsWin(boolean isWin) {
        this.isWin = isWin;
    }

    private int[] array = new int[10];

    int getIncNumber() {
        return incNumber;
    }

    void setIncNumber(int incNumber) {
        this.incNumber = incNumber;
    }

    int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }
}
