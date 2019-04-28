public class Cycle {
    public static void main(String[] args) {

        //for все числа от [0, 20]
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        //while все числа от [6, -6] (шаг итерации равен 2)
        int j = 6;
        while ( j >= -6 ) {
            System.out.println(j);
            ij = j - 2;
        }

        //do-while сумму всех нечетных чисел от [10, 20]
        int v = 10;
        int sum = 0;

        do {
            if (v% 2 == 0 ) {
                sum += v;
            }
            v++;
        } while ( v <= 20);
        System.out.println(sum);
    }
}
