public class GuessNamber {
    public static void main(String[] args) {

        int randomNumber = 20; // Случайное число компьютера 

        int myNumber = 20; // Мое число

        while (true) {
            if (myNumber > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (myNumber < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
            if (myNumber == randomNumber) {
                System.out.println("Вы угадали!");
                break;
            }
        }

    }

}