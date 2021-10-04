/**
 * This class is used to calculate the area of a circle with a given radius
 *
 * @author  Austin Li
 * @version August 31, 2021
 */

package assignment02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		//Initializing Variables and Objects
		Scanner keyboard = new Scanner(System.in);
		double r, area;
		
		//Retrieving User Input Radius
		System.out.print("Please enter radius: ");
		r = keyboard.nextDouble();
		
		//Calculations
		area = (Math.PI)*r*r;
		
		//Printing Results
		System.out.println("The area of a circle with radius " + r + " is " + area);
	}

}
