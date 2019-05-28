import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player("Первый игрок");
        Player player2 = new Player("Второй игрок");

        GuessNumber guessNumberPlayer = new GuessNumber(player1, player2);

        System.out.print("Введите имя первого игрока: ");
        player1.setName(scanner.nextLine() + " - ");
        System.out.print("Введите имя второго игрока: ");
        player2.setName(scanner.nextLine() + " - ");

        guessNumberPlayer.guessNumber();

        while (true) {
            System.out.println("Хотите продолжить? [да/нет]:");

            String answer = scanner.nextLine();

            if (answer.equals("да")) {
                guessNumberPlayer.guessNumber();
            } else if (answer.equals("нет")) {
                guessNumberPlayer.continueGame();
                break;
            }
        }
    }
}
