package com.startjava.lesson_2.game;

public class Player {
    private String name;
    private int number;
    private int total; //Отсебятина

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

    public int getNumber() {
        return number;
    }

    public int getTotal() {
        return total;
    }

    public void incrementTotal() {
        total++;
    }
}
