import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        boolean game = true;

        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player("Первый игрок");
        Player player2 = new Player("Второй игрок");

        GuessNumber guessNumberOne = new GuessNumber(player1, player2);

        while (game) {
            guessNumberOne.numberGet();
            System.out.println("Хотите продолжить? [да/нет]:");
            while (true) {
                String continueGame = scanner.next();
                if (continueGame.equals("да")) {
                    break;
                } else if (continueGame.equals("нет")) {
                    if (player1.getNumber() > player2.getNumber()) {
                        System.out.println("Выйграл " + player1.getName() + " со счетом " + player1.getNumber() + " : " + player2.getNumber());
                    } else if (player1.getNumber() < player2.getNumber()) {
                        System.out.println("Выйграл " + player2.getName() + " со счетом " + player2.getNumber() + " : " + player1.getNumber());
                    } else {
                        System.out.println("Ничья");
                    }
                    game = false;
                    break;
                } else {
                    System.out.println("Введите корректный ответ");
                    System.out.println("Хотите продолжить? [да/нет]:");
                }
            }
        }
    }
}
