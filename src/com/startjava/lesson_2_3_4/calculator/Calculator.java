package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private int numberOne;
    private String operator;
    private int numberTwo;

    private int getNumberOne() {
        return numberOne;
    }

    void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    private int getNumberTwo() {
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

    private String[] array = {};

    void calculateNumber() {
        int res;
        while (true) {
            switch (operator) {
                case "-":
                    res = Math.subtractExact(getNumberOne(), getNumberTwo());
                    array = addInEndArray(array, getNumberOne(), "-", getNumberTwo(), res);
                    System.out.println(res);
                    break;
                case "+":
                    res = Math.addExact(getNumberOne(), getNumberTwo());
                    array = addInEndArray(array, getNumberOne(), "+", getNumberTwo(), res);
                    System.out.println(res);
                    break;
                case "*":
                    res = Math.multiplyExact(getNumberOne(), getNumberTwo());
                    array = addInEndArray(array, getNumberOne(), "*", getNumberTwo(), res);
                    System.out.println(res);
                    break;
                case "/":
                    res = getNumberOne() / getNumberTwo();
                    array = addInEndArray(array, getNumberOne(), "/", getNumberTwo(), res);
                    break;
                case "^":
                    res = (int) Math.pow(getNumberOne(), getNumberTwo());
                    array = addInEndArray(array, getNumberOne(), "^", getNumberTwo(), res);
                    System.out.println(res);
                    break;
                case "%":
                    res = getNumberOne() % getNumberTwo();
                    array = addInEndArray(array, getNumberOne(), "%", getNumberTwo(), res);
                    System.out.println(res);
                    break;
            }
            break;
        }
    }

    private String createString() {
        StringBuilder output = new StringBuilder();

        for (String str : array)
            output.append(str).append(" ");
        return output.toString();
    }

    void mathInference() {
        for (String v : createString().split(" {2}", 0)) {
            System.out.println(v + "  ");
        }
    }

    private String[] addInEndArray(String[] arr, int numberOne, String mathOperator, int numberTwo, int total) {
        String[] result = Arrays.copyOf(arr, arr.length + 1);
        result[arr.length] = numberOne + " " + mathOperator + " " + numberTwo + " " + "=" + " " + total + " ";
        return result;
    }
}