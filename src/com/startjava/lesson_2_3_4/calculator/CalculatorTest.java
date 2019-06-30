package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "да";

        while (answer.equals("да")) {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scanner.nextLine();
            calculator.calculate(mathExpression);

            do {
                System.out.println("Хотите продолжить? [да/нет]:");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
        System.out.println("Конец: ");
    }
}
