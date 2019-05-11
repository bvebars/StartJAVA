public class unicode {
    public static void main(String[] args) {
        String s = "9398";
        char s1 = s.toCharArray()[0];

        System.out.print(s1);

        int a = 9398;
        int b = 10178;

        for (int i = a; i < b; i++) {

            String str = Integer.toString(i);
            char simvol = (char)Integer.parseInt(str);
            System.out.println(simvol);

        }

    }

}