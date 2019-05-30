import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player(GuessNumber.class.getName());
        Player player2 = new Player(GuessNumber.class.getName());

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        System.out.print("Введите имя первого игрока: ");
        player1.setName(scanner.nextLine() + " - ");
        System.out.print("Введите имя второго игрока: ");
        player2.setName(scanner.nextLine() + " - ");

        boolean logic = true;
        String answer;

        do {
            if (logic) {
                guessNumber.guessNumber();
            }

            System.out.println("Хотите продолжить? [да/нет]:");
            answer = scanner.nextLine();
            logic = true;

            if (!answer.equals("да")) {
                System.out.println("Введите правильный ответ ");
                logic = false;
            }
        } while (!answer.equals("нет"));

        guessNumber.definitionVictory();
    }
}
