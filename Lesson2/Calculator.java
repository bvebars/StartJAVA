import java.util.Scanner;

public class Calculator {
    boolean register;
    private Scanner scan = new Scanner(System.in);

    public Calculator(boolean register) {
        this.register = register;
    }

    public void calculateNumber() {

        while (register) {

            System.out.print("Введите первое число: ");
            int a = scan.nextInt();
            System.out.print("Введите знак математической операции: ");
            String operator = scan.next();
            System.out.print("Введите второе число: ");
            int b = scan.nextInt();

            switch (operator) {
                case "-":
                    System.out.println(a - b);
                    break;
                case "+":
                    System.out.println(a + b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                case "^":
                    int res = 1;
                    for (int i = 1; i <= b; i++) {
                        res *= a;
                    }
                    System.out.println("результат: " + res);
                    break;
                case "%":
                    System.out.println(a % b + "%");
                    break;
            }
            register = false;
        }
    }
}