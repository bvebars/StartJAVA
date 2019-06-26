package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private int numberOne;
    private String operator;
    private int numberTwo;
    private String[] array = {};

    int getNumberOne() {
        return numberOne;
    }

    void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    int getNumberTwo() {
        return numberTwo;
    }

    void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    void setOperator(String operator) {
        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") &&
                !operator.equals("/") && !operator.equals("^") && !operator.equals("%")) {
            System.out.println("Математическая операция не поддерживается");
            operator = scanner.next();
        }
        this.operator = operator;
    }

    void calculateNumber() {
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

    void addInEndArray(String arr) {
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
}