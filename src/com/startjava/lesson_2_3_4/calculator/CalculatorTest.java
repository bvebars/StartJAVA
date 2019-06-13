package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        String answer;

        do {
            System.out.print("Введите первое число: ");
            calculator.setNumberOne(scanner.nextInt());

            System.out.print("Введите оператор: ");
            calculator.setOperator(scanner.next());

            System.out.print("Введите второе число: ");
            calculator.setNumberTwo(scanner.nextInt());

            calculator.calculateNumber();
            System.out.println("Хотите продолжить? [да/нет]:");

            do {
                answer = scanner.next();
                if (!answer.equals("да") && (!answer.equals("нет"))) {
                    System.out.println("Введите правильный ответ ");
                } else {
                    break;
                }
            } while (true);

        } while (!answer.equals("нет"));

        System.out.println("История ваших операций: ");
        calculator.mathInference();
    }
}
