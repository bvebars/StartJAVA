import java.util.Scanner;

public class GuessNumber {

    Scanner scanner = new Scanner(System.in);

    public void numberGet(String nameOne, String nameTwo, int winOne, int winTwo) {

        boolean game = true;

        while (game) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);

            while (true) {
                System.out.print(nameOne + " вводит значение: ");
                int scan = scanner.nextInt();

                if (scan == randomNumber) {
                    System.out.println(nameOne + " угадал");
                    winOne++;
                    break;
                } else {
                    System.out.println(nameOne + " не угадал");
                    System.out.println(" ");
                }

                System.out.print(nameTwo + " вводит значение: ");
                int scan2 = scanner.nextInt();

                if (scan2 == randomNumber) {
                    System.out.println(nameTwo + " угадал|"); //Убрать
                    winTwo++;
                    break;
                } else {
                    System.out.println(nameTwo + " не угадал");
                    System.out.println(" ");
                }
            }

            System.out.println("Хотите продолжить? [да/нет]:");

            while (true) {
                String continueGame = scanner.next();
                if (continueGame.equals("да")) {
                    game = true;
                    break;
                } else if (continueGame.equals("нет")) {
                    game = false;
                    if (winOne > winTwo) {
                        System.out.println("Выйграл " + nameOne + " со счетом " + winOne + " : " + winTwo);
                    } else {
                        System.out.println("Выйграл " + nameTwo + " со счетом " + winTwo + " : " + winOne);
                    }
                    break;
                } else {
                    System.out.println("Введите корректный ответ");
                    System.out.println("Хотите продолжить? [да/нет]:");
                }
            }
        }
    }
}


