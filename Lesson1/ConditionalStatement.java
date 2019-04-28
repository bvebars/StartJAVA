public class ConditionalStatement {
    public static void main(String[] args) {

        int age = 28;
        boolean men = true;
        double growth = 1.70;
        char startname = 'В';

        if (age > 20) {
            System.out.println("Тебе больше 20 лет");
        }
        if (men == true) {
            System.out.println("Вы мужчина");
        }
        if (men == false) {
            System.out.println("Вы девушка");
        }
        if (growth > 1.80) {
            System.out.println("Гигант");
        } else {
            System.out.println("Метр с кепкой");
        }
        if (startname == 'М' ) {
            System.out.println("Вы наверно Михаил ?");
        } else if (startname == 'И' ) {
            System.out.println("Вы наверно Илья ?");
        } else {
            System.out.println("Значит Вячеслав");
        }

    }
}
