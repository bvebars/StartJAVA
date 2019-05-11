
public class Calculator {
    public static void main(String[] args) {


        int a = 50;  // Число 1
        int b = 4;  // Число 2
        String operator = "%"; //Оператор

        if (a > 0 || b > 0) {
            if (operator == "+") {
                System.out.println(a + b);

            } else if (operator == "-") {
                System.out.println(a - b);

            } else if (operator == "*") {
                System.out.println(a * b);

            } else if (operator == "/") {
                System.out.println(a / b);

            } else if (operator == "^") {
                for (int i = 0; i < b - 1; i++) {
                    a = a * b;
                }
                System.out.println(a);
            } else if (operator == "%") {

                int res = a % b;
                System.out.println(res + "%");

            }
        }
    }
}