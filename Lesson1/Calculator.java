public class Calculator {
    public static void main(String[] args) {
        int a = 100;  // Число 1
        int b = 0;  // Число 2
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
            if (b != 0) {                   // Проверка на ноль,при возведение в 0, число всегда будет равно 1
                if (b != 1) {               // Сделал проверку просто, что бы не тратить ресурсы на ЦИКЛ
                    for (int i = 1; i <= b; i++) {
                        res *= a;
                    }
                } else {
                    res = a;
                }
            } else {
                res = 1;
            }
            System.out.println(res);
            
        } else if (operator == "%") {
            System.out.println(a % b + "%");
        }
    }
}
