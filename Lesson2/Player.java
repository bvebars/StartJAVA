public class Player {
    private String name;
    private int number;
    private int numberWin;

    public Player(String x, int y, int z) {
        name = x;
        number = y;
        numberWin = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberWin() {
        return numberWin;
    }

    public void setNumberWin(int numberWin) {
        this.numberWin = numberWin;
    }
}
