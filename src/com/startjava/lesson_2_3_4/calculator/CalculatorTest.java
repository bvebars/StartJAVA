package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "да";

        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            calculator.setNumberOne(number1);
            calculator.addInEndArray(String.valueOf(calculator.getNumberOne()));

            System.out.print("Введите оператор: ");
            String operator = scanner.next();
            calculator.setOperator(operator);
            calculator.addInEndArray(operator);

            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();
            calculator.setNumberTwo(number2);
            calculator.addInEndArray(String.valueOf(calculator.getNumberTwo()));

            calculator.calculateNumber();

            do {
                System.out.println("Хотите продолжить? [да/нет]:");
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));

        }
        System.out.println("История ваших операций: ");
        calculator.convertArrayToString();
    }
}
