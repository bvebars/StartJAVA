import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player("Первый игрок", 0, 0);
        Player player2 = new Player("Второй игрок", 0, 0);

        boolean game = true;
        while (game) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);

            while (true) {
                System.out.print(player1.getName() + " вводит значение: ");
                player1.setNumber(scanner.nextInt());

                if (randomNumber == player1.getNumber()) {
                    System.out.println(player1.getName() + " угадал");
                    int i = player1.getNumberWin();
                    i++;
                    player1.setNumberWin(i);
                    break;
                } else {
                    System.out.println(player1.getName() + " не угадал");
                    System.out.println(" ");
                }

                System.out.print(player2.getName() + " вводит значение: ");
                player2.setNumber(scanner.nextInt());

                if (randomNumber == player2.getNumber()) {
                    System.out.println(player2.getName() + " угадал");
                    int i = player2.getNumberWin();
                    i++;
                    player2.setNumberWin(i);
                    break;
                } else {
                    System.out.println(player2.getName() + " не угадал");
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
                    if (player1.getNumberWin() > player2.getNumberWin()) {
                        System.out.println("Выйграл " + player1.getName() + " со счетом " + player1.getNumberWin() + " : " + player2.getNumberWin());
                    } else {
                        System.out.println("Выйграл " + player2.getName() + " со счетом " + player2.getNumberWin() + " : " + player1.getNumberWin());
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
