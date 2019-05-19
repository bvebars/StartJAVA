import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
                System.out.println(res);
                break;
            case "%":
                System.out.println(a % b + "%");
                break;
        }
    }
}
