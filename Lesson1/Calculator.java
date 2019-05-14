public class Calculator {
    public static void main(String[] args) {
        int a = 4;  // Число 1
        int b = 4;  // Число 2
        String operator = "^"; //Оператор

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
                if (a > 0 && b > 0) {
                    for (int i = 0; i < b - 1; i++) {
                        a *= b;
                    }
                } else {
                    a = 0;
                }
                System.out.println(a);
            } else if (operator == "%") {
                System.out.println(a % b + "%");
            }
        }
    }
}
