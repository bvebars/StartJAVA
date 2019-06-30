package com.startjava.lesson_2_3_4.calculator;

import java.util.Arrays;

class Calculator {
    private int numberOne;
    private String operator;
    private int numberTwo;
    private String[] arrayOfValuesReceived = {};

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public String getOperator() {
        return operator;
    }

    public void mathInference() {
        StringBuilder result = new StringBuilder();
        int inc = 0;
        for (String s : arrayOfValuesReceived) {
            result.append(s).append(" ");
            inc++;
            if (inc == 3) {
                result.append(" ");
                inc = inc - 3;
            }
        }
        for (String v : String.valueOf(result).split(" {2}", 0)) {
            System.out.println(v + "  ");
        }
    }

    public void calculate(String mathExpression) {
        delimitingStringByChars(mathExpression);

        switch (operator) {
            case "-":
                System.out.println(Math.subtractExact(numberOne, numberTwo));
                break;
            case "+":
                System.out.println(Math.addExact(numberOne, numberTwo));
                break;
            case "*":
                System.out.println(Math.multiplyExact(numberOne, numberTwo));
                break;
            case "/":
                System.out.println(numberOne / numberTwo);
                break;
            case "^":
                System.out.println((int) Math.pow(numberOne, numberTwo));
                break;
            case "%":
                System.out.println(numberOne % numberTwo);
                break;
            default:
                System.out.println("Ошибка");
        }
    }

    private void delimitingStringByChars(String MathExpression) {
        String[] expression = MathExpression.split(" ");

        numberOne = Integer.parseInt(expression[0]);
        operator = expression[1];
        numberTwo = Integer.parseInt(expression[2]);

        addInArray(String.valueOf(numberOne));
        addInArray(operator);
        addInArray(String.valueOf(numberTwo));
    }

    private void addInArray(String arr) {
        arrayOfValuesReceived = Arrays.copyOf(arrayOfValuesReceived, arrayOfValuesReceived.length + 1);
        arrayOfValuesReceived[arrayOfValuesReceived.length - 1] = arr;
    }
}