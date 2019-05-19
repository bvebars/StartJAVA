public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(6);
        wolf.setColor("black");
        wolf.setNickname("Beer");
        wolf.setSex("man");
        wolf.setWeight(1);

        System.out.println("Кличка: " + wolf.getNickname());
        System.out.println("Пол: " + wolf.getSex());
        System.out.println("Возраст : " + wolf.getAge());
        System.out.println("Цвет: " + wolf.getColor());
        System.out.println("Вес: " + wolf.getWeight());

        System.out.println("Идти " + wolf.go());
        System.out.println("Бежать " + wolf.run());
        System.out.println("Сидеть " + wolf.sit());
        System.out.println("Лаять " + wolf.howl());
        System.out.println("Охотиться " + wolf.hunt());
    }
}
