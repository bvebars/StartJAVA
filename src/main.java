public class main {
    public static void main(String[] args) {
        while (true) {
            int randomNumber = (int) (Math.random() * 101);
            System.out.println(randomNumber);
            if (randomNumber == 100) {
                break;
            }
        }
    }
}
