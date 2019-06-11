package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    private int numberOne;
    private String operator;
    private int numberTwo;

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

    public void setOperator(String operator) {
        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") &&
                !operator.equals("/") && !operator.equals("^") && !operator.equals("%")) {
            System.out.println("Математическая операция не поддерживается");
            operator = scanner.next();
        }
        this.operator = operator;
    }

    public void calculateNumber() {
        while (true) {

            switch (operator) {
                case "-":
                    System.out.println(getNumberOne() - getNumberTwo());
                    break;
                case "+":
                    System.out.println(getNumberOne() + getNumberTwo());
                    break;
                case "*":
                    System.out.println(getNumberOne() * getNumberTwo());
                    break;
                case "/":
                    System.out.println(getNumberOne() / getNumberTwo());
                    break;
                case "^":
                    int res = 1;
                    for (int i = 1; i <= getNumberTwo(); i++) {
                        res *= getNumberOne();
                    }
                    System.out.println("результат: " + res);
                    break;
                case "%":
                    System.out.println(getNumberOne() % getNumberTwo() + "%");
                    break;
            }
            break;
        }
    }
}