/**
 * This class is used to find the smallest integer with a hailstone sequence of a given length
 *
 * @author  Austin Li
 * @version September 10, 2021
 */

package assignment03;

import java.util.Scanner;

public class HailstoneSearch {

	public static void main(String[] args) {
		
		//Retrieving user input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter in a positive sequence length: ");
		int userNum = keyboard.nextInt();
		
		//Making sure user input is positive
		while(userNum < 1) {
			System.out.print("Negative numbers are not allowed. Please enter in a positive number: ");
			userNum = keyboard.nextInt();
		}
		
		keyboard.close();
		
		//Searching through hailstone sequences and comparing the length to user input
		int count = 0;
		int startingVal = 1;
		int currentVal = startingVal;
		
		while(count != userNum) {
			count = 0;
			startingVal++;
			currentVal = startingVal;
			while(currentVal != 1) {
				if(currentVal % 2 == 0) {
					currentVal = currentVal/2;
				}
				else {
					currentVal = currentVal*3 + 1;
				}
				count++;
			}
		}
		
		System.out.println("The smallest starting point is " + startingVal + " is: " + " for a hailstone sequence with length " + userNum);
		
	}

}
