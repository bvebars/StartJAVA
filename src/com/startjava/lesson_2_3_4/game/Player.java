package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int incNumber = 0;
    private boolean isWin = false;
    private int[] array = new int[10];

    boolean isWin() {
        return isWin;
    }

    void setWin(boolean win) {
        isWin = win;
    }

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

    public void setName(String name) {
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
