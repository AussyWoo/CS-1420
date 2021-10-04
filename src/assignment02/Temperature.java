/**
 * This class is used to convert a fahrenheit value into celsius.
 *
 * @author  Austin Li
 * @version August 31, 2021
 */

package assignment02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		//Initializing Variables and Objects
		Scanner keyboard = new Scanner(System.in);
		double fahrenheit, celsius;
		
		//Recieving User Input
		System.out.print("Please enter temperature in Fahrenheit: ");
		fahrenheit = keyboard.nextDouble();
		
		//Calculations and Output
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(fahrenheit + " in celsius is " + celsius + ".");
	}

}
