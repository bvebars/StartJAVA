package com.startjava.lesson_2_3_4.calculator;

class Calculator {
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

    public String getOperator() {
        return operator;
    }

    public void calculate(String mathExpression) {
        splitMathExpression(mathExpression);
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

    private void splitMathExpression(String mathExpression) {
        String[] expression = mathExpression.split(" ");

        numberOne = Integer.parseInt(expression[0]);
        operator = expression[1];
        numberTwo = Integer.parseInt(expression[2]);
    }
}