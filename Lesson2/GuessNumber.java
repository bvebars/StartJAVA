import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void numberGet() {

        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);

        while (true) {
            System.out.print(player1.getName() + " вводит значение: ");
            int scan = scanner.nextInt();

            if (scan == randomNumber) {
                System.out.println(player1.getName() + " угадал ");
                int i = player1.getNumber();
                i++;
                player1.setNumber(i);
                System.out.println(player1.getNumber());
                break;
            } else {
                System.out.println(player1.getName() + " не угадал");
                System.out.println(" ");
            }

            System.out.print(player2.getName() + " вводит значение: ");
            int scan2 = scanner.nextInt();

            if (scan2 == randomNumber) {
                System.out.println(player2.getName() + " угадал");
                int i = player2.getNumber();
                i++;
                player2.setNumber(i);
                break;
            } else {
                System.out.println(player2.getName() + " не угадал");
                System.out.println(" ");
            }
        }
    }
}


