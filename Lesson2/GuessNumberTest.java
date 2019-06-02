import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);

        String answer;

        do {
            guessNumber.guessNumber();
            System.out.println("Хотите продолжить? [да/нет]:");
            answer = scanner.nextLine();

            if (!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Введите правильный ответ, в случае неправильного ответа играть придется с начала.");
            }

        } while (!answer.equals("нет"));

        guessNumber.determineWinner();
    }
}
