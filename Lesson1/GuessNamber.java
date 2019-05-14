public class GuessNumber {
    public static void main(String[] args) {
        int randomNumber = 20; // Случайное число компьютера
        int myNumber = 40; // Мое число

        while (myNumber != randomNumber) {
            if (myNumber > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                myNumber--;
            } else if (myNumber < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                myNumber++;
            }
        }
        System.out.println("Вы угадали!");
    }
}
