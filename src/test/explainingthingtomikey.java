package test;

public class explainingthingtomikey {
    private static int x = 0;

    public static void main(String[] args) {
        int x = 15;
        System.out.println(multiply(x, x));
        System.out.println(add(x, x));
    }

    public static int multiply(int num, int num2) {
        return num*num2;
    }

    public static int add(int num, int num2) {
        return num + num2;
    }
}
