package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

class Calculator {
    private int numberOne;
    private String operator;
    private int numberTwo;
    private String[] array = {};

    private int getNumberOne() {
        return numberOne;
    }

    private void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    private int getNumberTwo() {
        return numberTwo;
    }

    private void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    private String getOperator() {
        return operator;
    }

    private void addInEndArray(String arr) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = arr;
    }

    void convertArrayToString() {
        StringBuilder result = new StringBuilder();
        int inc = 0;
        for (String s : array) {
            result.append(s).append(" ");
            inc++;
            if (inc == 3) {
                result.append(" ");
                inc = inc - 3;
            }
        }
        mathInference(String.valueOf(result));
    }

    private void mathInference(String str) {
        for (String v : str.split(" {2}", 0)) {
            System.out.println(v + "  ");
        }
    }

    void convertStringToArray(String str) {
        StringBuilder numberOneStr = new StringBuilder();
        StringBuilder numberTwoStr = new StringBuilder();

        int i = 0;
        while (!(str.charAt(i) == ' ')) {
            numberOneStr.append(str.charAt(i));
            i++;
        }

        if (i == numberOneStr.length()) {
            operator = String.valueOf(str.charAt(i + 1));
            i += 2;
        }

        while (i + 1 < str.length()) {
            i++;
            numberTwoStr.append(str.charAt(i));
        }

        setNumberOne(Integer.parseInt(String.valueOf(numberOneStr)));
        setNumberTwo(Integer.parseInt(String.valueOf(numberTwoStr)));

        addInEndArray(String.valueOf(getNumberOne()));
        addInEndArray(String.valueOf(getOperator()));
        addInEndArray(String.valueOf(getNumberTwo()));
    }

    void calculate() {
        switch (operator) {
            case "-":
                System.out.println(Math.subtractExact(getNumberOne(), getNumberTwo()));
                break;
            case "+":
                System.out.println(Math.addExact(getNumberOne(), getNumberTwo()));
                break;
            case "*":
                System.out.println(Math.multiplyExact(getNumberOne(), getNumberTwo()));
                break;
            case "/":
                System.out.println(getNumberOne() / getNumberTwo());
                break;
            case "^":
                System.out.println((int) Math.pow(getNumberOne(), getNumberTwo()));
                break;
            case "%":
                System.out.println(getNumberOne() % getNumberTwo());
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}