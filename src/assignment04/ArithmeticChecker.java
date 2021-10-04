/**
 * This class is used to check data files for arithmetic accuracy.
 *
 * @author  Austin Li
 * @version September 25, 2021
 */

package assignment04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmeticChecker {

	public static void main(String[] args) {
		// Asking user for File Name
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter File Name to check: ");
		String fileName = keyboard.next();

		// Attempt to access the file
		try {
			File file = new File(fileName);
			Scanner reader = new Scanner(file);
			check(reader);
			
			System.out.println("File " + fileName + " does not have any arithmetic errors.");

		} catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " cannot be accessed.");
		} catch (IllegalStateException e) {
			
		}

	}

	/**
	 * Main checking algorithm. Will recursively add up all values in a subgroup and
	 * compare that sum with the given total for accuracy
	 * @param data scanner of the data file
	 * @return Returns a sum if no errors are found, otherwise it'll print the error details
	 */
	public static int check(Scanner data) {
		// Scan first line to grab important data
		int entries = data.nextInt();
		data.next();
		data.next();
		String date = data.next();
		data.next();
		
		int total = parseNum(data.next());

		int sum = 0;

		//Iterate through each entry. Will use recursion if a line gets to a new subgroup.
		for(int i = 0; i < entries; i++) {
			if (data.next().equals("SUBGROUP")) {
				sum += check(data);
			} else {
				if (data.hasNextLine()) {
					data.next();
					sum += parseNum(data.next());
				}

			}
		}
		
		//Check if numbers match, print and throw error if not
		//Extra print statements are to ensure that $73.30 doesn't print as $73.3
		if(sum != total){
			System.out.println("Arithmetic error on " + date);
			System.out.print("Amount is recorded as $");
			System.out.printf("%.2f", sum/100.0); 
			System.out.print(", should actually be $");
			System.out.printf("%.2f", total/100.0);
			System.out.print(".");
			throw new IllegalStateException();
		}
		return sum;
	}
	
	/**
	 * Convert $xx.xx into an integer representing cents
	 * @param value The string containing the wanted value
	 * @return parsed integer of the value in cents
	 */
	public static int parseNum(String value) {
		return Integer.parseInt(String.join("", value.substring(1).split("\\.")));
	}
}
