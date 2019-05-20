import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean game = true;

        while (game) {
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
            
            System.out.println("Хотите продолжить? [да/нет]:");

            while (true) {
                String continueGame = scan.next();
                if (continueGame.equals("да")) {
                    game = true;
                    break;
                } else if (continueGame.equals("нет")) {
                    game = false;
                    break;
                } else {
                    System.out.println("Введите корректный ответ");
                    System.out.println("Хотите продолжить? [да/нет]:");
                }
            }
        }
    }
}
