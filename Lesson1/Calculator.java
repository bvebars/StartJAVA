public class Calculator {
    public static void main(String[] args) {
        int a = 100;  // Число 1
        int b = 2;  // Число 2
        String operator = "^"; //Оператор

        if (operator == "+") {
            System.out.println(a + b);
        } else if (operator == "-") {
            System.out.println(a - b);

        } else if (operator == "*") {
            System.out.println(a * b);

        } else if (operator == "/") {

            System.out.println(a / b);
        } else if (operator == "^") {
            int res = 1;
            for (int i = 1; i <= b; i++) {
                res *= a;
            }
            System.out.println(res);
        } else if (operator == "%") {
            System.out.println(a % b + "%");
        }
    }
}
