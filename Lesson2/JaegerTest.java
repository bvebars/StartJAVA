//без конструктора
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger();

        gipsyAvenger.setModelName("Gipsy Avenger");
        gipsyAvenger.setMark("ark-6");
        gipsyAvenger.setOrigin("USA");
        gipsyAvenger.setHeight(81.7);
        gipsyAvenger.setWeight(2.0004);
        gipsyAvenger.setSpeed(3);
        gipsyAvenger.setStrenght(5);
        gipsyAvenger.setArmor(6);

        gipsyAvenger.drift();
        gipsyAvenger.move();
        gipsyAvenger.useVortexCannon();

        System.out.println("Параметры робота №1:");
        System.out.println("Name: " + gipsyAvenger.getModelName());
        System.out.println("Mark: " + gipsyAvenger.getMark());
        System.out.println("Origin: " + gipsyAvenger.getOrigin());
        System.out.println("Height: " + gipsyAvenger.getHeight());
        System.out.println("Weight: " + gipsyAvenger.getWeight());
        System.out.println("Speed: " + gipsyAvenger.getSpeed());
        System.out.println("Strenght: " + gipsyAvenger.getStrenght());
        System.out.println("Armor: " + gipsyAvenger.getArmor());
        System.out.println("drift: " + gipsyAvenger.drift());
        System.out.println("move: " + gipsyAvenger.move());
        System.out.println("useVortexCannon: " + gipsyAvenger.useVortexCannon());
        System.out.println("");

        Jaeger obsidianFury = new Jaeger();

        obsidianFury.setModelName("Obsidian Fury");
        obsidianFury.setMark("ark-2");
        obsidianFury.setOrigin("USA");
        obsidianFury.setHeight(88.7);
        obsidianFury.setWeight(3.004);
        obsidianFury.setSpeed(1);
        obsidianFury.setStrenght(5);
        obsidianFury.setArmor(8);

        obsidianFury.drift();
        obsidianFury.move();
        obsidianFury.scanKaiju();

        System.out.println("Параметры робота №2:");
        System.out.println("Name: " + obsidianFury.getModelName());
        System.out.println("Mark: " + obsidianFury.getMark());
        System.out.println("Origin: " + obsidianFury.getOrigin());
        System.out.println("Height: " + obsidianFury.getHeight());
        System.out.println("Weight: " + obsidianFury.getWeight());
        System.out.println("Speed: " + obsidianFury.getSpeed());
        System.out.println("Strenght: " + obsidianFury.getStrenght());
        System.out.println("Armor: " + obsidianFury.getArmor());
        System.out.println("drift: " + obsidianFury.drift());
        System.out.println("move: " + obsidianFury.move());
        System.out.println("useVortexCannon: " + obsidianFury.useVortexCannon());
    }
}
