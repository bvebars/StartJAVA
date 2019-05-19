public class Wolf {

    private String sex = "women";
    private String nickname = "Stella";
    private int weight = 10;
    private int age = 3;
    private String color = "white";

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 7) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean go() {
        return true;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean sit() {
        return false;
    }

    public boolean run() {
        return true;
    }

    public String howl() {
        return "Woof woof";
    }

    public boolean hunt() {
        return false;
    }
}
