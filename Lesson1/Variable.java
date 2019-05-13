public class Variable {
    public static void main(String[] args) {
        byte ram = 8;
        short core = 4;
        int flow = 8;
        float cpu = 3.20f;
        double cpuTurboBust = 4.46;
        char generation = '7';
        boolean work = true;

        System.out.println("Количество оперативной памяти: " + ram +  " гб." );
        System.out.println("Количество ядер: " + core + " ядра");
        System.out.println("Количество потоков: " + flow);
        System.out.println("Частота процессора: " + cpu + " GHz" );
        System.out.println("Максимальная частота в разгоне: " + cpuTurboBust + " GHz");
        System.out.println("Поколение: " + generation);
        System.out.println("Еще работает? " + work);
    }
}