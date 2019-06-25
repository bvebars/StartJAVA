package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String[] array = {};
        String answer;

        do {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            calculator.setNumberOne(number1);
            array = Calculator.addInEndArray(array, String.valueOf(number1));

            System.out.print("Введите оператор: ");
            String operator = scanner.next();
            calculator.setOperator(operator);
            array = Calculator.addInEndArray(array, operator);

            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();
            calculator.setNumberOne(number2);
            array = Calculator.addInEndArray(array, String.valueOf(number2));

            calculator.calculateNumber();

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                answer = scanner.next();
                if (!answer.equals("да") && (!answer.equals("нет"))) {
                    System.out.println("Введите правильный ответ ");
                } else {
                    break;
                }
            } while (true);

        } while (!answer.equals("нет"));
        System.out.println("История ваших операций: " );
        calculator.createString(array);
    }
}
