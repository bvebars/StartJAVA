public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        System.out.println(wolf.nickname);
        System.out.println(wolf.sex);
        System.out.println(wolf.age);
        System.out.println(wolf.weight);
        System.out.println(wolf.color);

        System.out.println("Идти " + wolf.go());
        System.out.println("Бежать " + wolf.run());
        System.out.println("Сидеть " + wolf.sit());
        System.out.println("Лаять " + wolf.howl());
        System.out.println("Охотиться " + wolf.hunt());
    }
}
