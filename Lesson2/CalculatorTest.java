import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(true);

        while (true) {
            calculator.calculateNumber();

            System.out.println("Хотите продолжить? [да/нет]:");
            String continueGame = scanner.next();

            if (continueGame.equals("да")) {
                calculator.register = true;
                calculator.calculateNumber();
            } else if (continueGame.equals("нет")) {
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
