public class Variable {
    public static void main(String[] args) {
        
        byte RAM = 8;
        short core = 4;
        int flow = 8;
        float CPU = 3.20f ;
        double CPUTurboBust = 4.46;
        char generation = '7';
        boolean work = true;

        System.out.println("Количество оперативной памяти: " + RAM +  " гб." );
        System.out.println("Количество ядер: " + core + " ядра/");
        System.out.println("Количество потоков: " + flow);
        System.out.println("Частота процессора: " + CPU + " GHz" );
        System.out.println("Максимальная частота в разгоне: " + CPUTurboBust + " GHz");
        System.out.println("Поколение: " + generation);
        System.out.println("Еще работает? " + work);
        
    }
}
