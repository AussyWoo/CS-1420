/**
 * This class is used to calculate the hypotenuse of a right triangle with 2 given sides.
 *
 * @author  Austin Li
 * @version August 31, 2021
 */

package assignment02;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		//Initializing Variables and Objects
		Scanner keyboard = new Scanner(System.in);
		double x, y, z;

		//Retrieving User input
		System.out.print("Enter the x value: ");
		x = keyboard.nextDouble();
		System.out.print("Enter the y value: ");
		y = keyboard.nextDouble();
		
		//Calculations
		z = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		System.out.println("The hypotenuse of a right triangle with sides " + x + " and " + y + " is " + z + ".");
	}

}
