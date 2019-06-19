package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private boolean win;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getNumber() {
        return number;
    }

    public boolean getWin() {
        return win;
    }
}
