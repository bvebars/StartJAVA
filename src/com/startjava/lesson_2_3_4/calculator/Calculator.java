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
        while (true) {

            switch (operator) {
                case "-":
                    array = Arrays.copyOf(array, array.length + 5);
                    array[array.length - 5] = String.valueOf(getNumberOne());
                    array[array.length - 4] = "-";
                    array[array.length - 3] = String.valueOf(getNumberTwo());
                    array[array.length - 2] = "=";
                    array[array.length - 1] = Math.subtractExact(getNumberOne(), getNumberTwo()) + " ";
                    break;
                case "+":
                    array = Arrays.copyOf(array, array.length + 5);
                    array[array.length - 5] = String.valueOf(getNumberOne());
                    array[array.length - 4] = "*";
                    array[array.length - 3] = String.valueOf(getNumberTwo());
                    array[array.length - 2] = "=";
                    array[array.length - 1] = Math.addExact(getNumberOne(), getNumberTwo()) + " ";
                    break;
                case "*":
                    array = Arrays.copyOf(array, array.length + 5);
                    array[array.length - 5] = String.valueOf(getNumberOne());
                    array[array.length - 4] = "*";
                    array[array.length - 3] = String.valueOf(getNumberTwo());
                    array[array.length - 2] = "=";
                    array[array.length - 1] = Math.multiplyExact(getNumberOne(), getNumberTwo()) + " ";
                    break;
                case "/":
                    array = Arrays.copyOf(array, array.length + 5);
                    array[array.length - 5] = String.valueOf(getNumberOne());
                    array[array.length - 4] = "/";
                    array[array.length - 3] = String.valueOf(getNumberTwo());
                    array[array.length - 2] = "=";
                    array[array.length - 1] = getNumberOne() / getNumberTwo() + " ";
                    break;
                case "^":
                    array = Arrays.copyOf(array, array.length + 5);
                    array[array.length - 5] = String.valueOf(getNumberOne());
                    array[array.length - 4] = "^";
                    array[array.length - 3] = String.valueOf(getNumberTwo());
                    array[array.length - 2] = "=";
                    array[array.length - 1] = Math.pow(getNumberOne(), getNumberTwo()) + " ";
                    break;
                case "%":
                    array = Arrays.copyOf(array, array.length + 5);
                    array[array.length - 5] = String.valueOf(getNumberOne());
                    array[array.length - 4] = "^";
                    array[array.length - 3] = String.valueOf(getNumberTwo());
                    array[array.length - 2] = "=";
                    array[array.length - 1] = getNumberOne() % getNumberTwo() + " ";
                    break;
            }
            break;
        }
    }

    private String createString() {
        String output = "";

        for (String str : array)
            output = output + str + " ";
        return output;
    }

    void mathInference() {
        for (String v : createString().split("  ", 0)) {
            System.out.println(v + "  ");
        }
    }
}