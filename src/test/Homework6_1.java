package test;

public class Homework6_1 {

    public static void main(String[] args) {
        System.out.println("The sum of " + 1 + " and " + 2 + " is " + add(1, 2) + ".");
        System.out.println("The sum of " + 1.0 + " and " + 2.0 + " is " + add(1.0, 2.0) + ".");
        System.out.println("The sum of " + 1 + " and " + 2.0 + " is " + add(1, 2.0) + ".");
        System.out.println("The sum of " + 1.0 + " and " + 2 + " is " + add(1.0, 2) + ".");
    }

    public static int add(int x, int y) {
        return (x+y);
    }

    public static double add(double x, int y) {
        return (x+y);
    }

    public static double add(double x, double y) {
        return (x+y);
    }

    public static double add(int x, double y) {
        return (x+y);
    }
}
