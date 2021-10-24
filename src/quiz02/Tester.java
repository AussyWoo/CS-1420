/**
 * This class tests all methods within the Tesseract class for bugs.
 *
 * @author  Austin Li
 * @version October 8, 2021
 **/

package quiz02;

public class Tester {
    public static void main(String[] args) {
        System.out.println("This class will test all the methods of the included Tesseract class.");
        System.out.println();

        //Initializing and testing objects

        //Test one (given): Tessts volume and surface area
        Tesseract one = new Tesseract(30, 70, 12, 5);
        System.out.println("One: Tests volume and surface area methods.");
        System.out.println("Volume: " + one.getVolume());
        System.out.println("Surface Area: " + one.getSArea());
        System.out.println();

        //Test two (given): Tests volume and surface area
        Tesseract two = new Tesseract(8, 11, 3, 10);
        System.out.println("Two: Tests volume and surface area.");
        System.out.println("Volume: " + two.getVolume());
        System.out.println("Surface Area: " + two.getSArea());
        System.out.println();

        //Test three (self-made): Tests getter methods, volume, and surface area, and toString
        Tesseract three = new Tesseract(12, 13, 14, 15);
        System.out.println("Three: Tests getter, volume, surface area, and toString methods.");
        System.out.println("Dimensions: (" + three.getX() + ", " + three.getY() + ", " + three.getZ() + ")");
        System.out.println("Volume: " + three.getVolume());
        System.out.println("Surface Area: " + three.getSArea());
        System.out.println("Anomalies: " + three.getAnomalies());
        System.out.println(three);
        System.out.println();

        //Test four (self-made): Tests getter and mutator methods, volume, and surface area and toString
        Tesseract four = new Tesseract(12, 13, 14, 15);
        System.out.println("Four: Tests getter, mutator, volume, surface area, and toString methods.");
        System.out.println("Dimensions: (" + four.getX() + ", " + three.getY() + ", " + three.getZ() + ")");
        System.out.println("Initial Volume: " + four.getVolume());
        System.out.println("Initial Surface Area: " + four.getSArea());
        System.out.println("Anomalies: " + four.getAnomalies());

        System.out.println("<Changing anomalies to 16>");
        four.setAnomalies(16);
        System.out.println("Anomalies: " + four.getAnomalies());
        System.out.println(four);
        System.out.println();

    }
}
