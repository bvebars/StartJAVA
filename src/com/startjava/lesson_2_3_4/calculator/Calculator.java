package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private int numberOne;
    private String operator;
    private int numberTwo;
    private int sign;

    private int getNumberOne() {
        return numberOne;
    }

    void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    private int getNumberTwo() {
        return numberTwo;
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
        while (true) {

            switch (operator) {
                case "-":
                    sign = Math.subtractExact(getNumberOne(), getNumberTwo());
                    break;
                case "+":
                    sign = Math.addExact(getNumberOne(), getNumberTwo());
                    break;
                case "*":
                    sign = Math.multiplyExact(getNumberOne(), getNumberTwo());
                    break;
                case "/":
                    sign = getNumberOne() / getNumberTwo();
                    break;
                case "^":
                    sign = (int) Math.pow(getNumberOne(), getNumberTwo());
                    break;
                case "%":
                    sign = getNumberOne() % getNumberTwo();
                    break;
            }
            break;
        }
    }

    static String[] addInEndArray(String[] arr, String sign) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = sign;
        return arr;
    }

    void createString(String[] arr) {
        StringBuilder output = new StringBuilder();
        int increment1 = 0;
        int increment2 = 2;

        for (String str : arr) {

            if (increment1 == increment2) {
                output.append(str).append("  ");
                increment2 = increment2 + 3;
            } else {
                output.append(str).append(" ");
            }
            increment1++;
        }
        mathInference(output.toString());
    }

    private void mathInference(String arr) {
        for (String v : arr.split(" {2}", 0)) {
            System.out.println(v + "  ");
        }
    }
}