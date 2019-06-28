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

    private void addInEndArray(String arr) {
        arrayOfValuesReceived = Arrays.copyOf(arrayOfValuesReceived, arrayOfValuesReceived.length + 1);
        arrayOfValuesReceived[arrayOfValuesReceived.length - 1] = arr;
    }

    void outputValues() {
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
        mathInference(String.valueOf(result));
    }

    void calculate(String mathExpression) {
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

    private void delimitingStringByChars(String strMathExpression1) {
        String[] temporaryArray = new String[3];
        int i = 0;
        for (String v : strMathExpression1.split(" ", 0)) {
            temporaryArray[i] = v;
            i++;
        }
        numberOne = Integer.parseInt(temporaryArray[0]);
        operator = temporaryArray[1];
        numberTwo = Integer.parseInt(temporaryArray[2]);

        addInEndArray(String.valueOf(numberOne));
        addInEndArray(operator);
        addInEndArray(String.valueOf(numberTwo));
    }

    private void mathInference(String strMathExpression2) {
        for (String v : strMathExpression2.split(" {2}", 0)) {
            System.out.println(v + "  ");
        }
    }
}