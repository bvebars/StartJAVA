import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean game = true;

        while (game) {
            System.out.println("Введите числа:");

            int a = scan.nextInt();
            String operator = scan.next();
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
                    System.out.println("результат: "+ res);
                    break;
                case "%":
                    System.out.println(a % b + "%");
                    break;
            }
            System.out.println("Хотите продолжить? [да/нет]: ");

            String continueGame = scan.next();

            switch (continueGame) {
                case "да":
                    game = true;
                    break;
                case "нет":
                    game = false;
                    break;
                default:
                    System.out.println("Введите корректную строку");
            }
        }
    }
}
