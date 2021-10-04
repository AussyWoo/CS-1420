/**
 * This class is used to print out the hailstone sequence of any given start number
 *
 * @author  Austin Li
 * @version September 10, 2021
 */

package assignment03;

import java.util.Scanner;

public class Hailstone {

	public static void main(String[] args) {
		
		//Retrieving user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter in a positive starting value: ");
		int userNum = keyboard.nextInt();
		
		//Making sure user input is positive
		while(userNum < 1) {
			System.out.print("Please enter in a positive number: ");
			userNum = keyboard.nextInt();
		}
		
		keyboard.close();
		
		//Calculating and Printing Hailstone sequence
		int count = 0;
		System.out.println("\nThe hailstone sequence starting from " + userNum + " is:");
		while(userNum != 1) {
			System.out.print(userNum + " ");
			if(userNum % 2 == 0) {
				userNum = userNum/2;
			}
			else {
				userNum = userNum*3 + 1;
			}
			count++;
		}
		System.out.println("1\n");
		System.out.println("The total length of this sequence is: " + count);

	}

}
