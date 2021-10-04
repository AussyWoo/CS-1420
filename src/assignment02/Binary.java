/**
 * This class is used to convert any number up to 255 to binary.
 *
 * @author  Austin Li
 * @version August 31, 2021
 */

package assignment02;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// Initializing Variables and Objects
		Scanner keyboard = new Scanner(System.in);
		String bin = "";
		int num;
		
		//Retrieving User Input
		System.out.print("Enter a number: ");
		num = keyboard.nextInt();
		
		//Making a string with the binary value
		for(int i = 7; i > -1; i--) {
			bin += "" + (int)(num/(Math.pow(2, i)) % 2);
		}
		
		//Print Statements
		System.out.println("The decimal number " + num + " is " + bin + " in binary.");
	}

}
