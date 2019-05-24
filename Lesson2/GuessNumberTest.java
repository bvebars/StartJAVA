public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player("Первый игрок");
        Player player2 = new Player("Второй игрок");

        GuessNumber guessNumberOne = new GuessNumber(player1, player2);

        guessNumberOne.guessNumber();

        guessNumberOne.continueGame();
    }
}
