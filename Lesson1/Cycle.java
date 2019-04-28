public class Cycle {
    public static void main(String[] args) {

        //for все числа от [0, 20]
        for (int i_1 = 0; i_1 <= 20; i_1++) {
            System.out.println(i_1);
        }
        //while все числа от [6, -6] (шаг итерации равен 2)
        int i_2 = 6;
        while ( i_2 >= -6 ) {
            System.out.println(i_2);
            i_2 = i_2 - 2;
        }

        //do-while сумму всех нечетных чисел от [10, 20]
        int i_3 = 10;
        int sum = 0;

        do {
            if (i_3% 2 == 0 ) {
                sum += i_3;
            }
            i_3++;
        } while ( i_3 <= 20);
        System.out.println(sum);
    }
}
