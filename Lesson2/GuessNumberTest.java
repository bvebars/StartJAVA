
public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player("Первый игрок", 0);
        Player player2 = new Player("Второй игрок", 0);
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.numberGet(player1.getName(),player2.getName(), player1.getNumber(), player2.getNumber());
    }
}
