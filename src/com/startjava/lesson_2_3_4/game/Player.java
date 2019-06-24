package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int incNumber = 0;
    private boolean isWin = false;
    private int[] array = new int[10];

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }


    public int getIncNumber() {
        return incNumber;
    }

    public void setIncNumber(int incNumber) {
        this.incNumber = incNumber;
    }


    public int[] getArray() {
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


//    public static int incrementNumber() {
//        return incrementNumber() + 1;
//    }
}
