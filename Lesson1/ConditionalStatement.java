public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 28;
        boolean man = true;
        double growth = 1.70;
        char startName = 'В';

        if (age > 20) {
            System.out.println("Тебе больше 20 лет");
        }
        if (man) {
            System.out.println("Вы мужчина");
        }
        if (!man) {
            System.out.println("Вы девушка");
        }
        if (growth > 1.80) {
            System.out.println("Гигант");
        } else {
            System.out.println("Метр с кепкой");
        }
        if (startName == 'М') {
            System.out.println("Вы, наверно, Михаил ?");
        } else if (startName == 'И') {
            System.out.println("Вы, наверно, Илья ?");
        } else {
            System.out.println("Значит Вячеслав");
        }
    }
}