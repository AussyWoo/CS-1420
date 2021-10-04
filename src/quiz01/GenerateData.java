/*
 * This class generates a random int and double for Concerning Car Noises.
 * The integer represents the # of occurrences a car has exhibited a given noise.
 * The double represents the % chance the car will make that noise in any given second.
 * 
 * @author  Austin Li
 * @version September 14, 2021
 */

package quiz01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GenerateData {

	public static void main(String[] args) {
		//Initialize file scanner
		Scanner file = null;
		
		//Try to read DataNames.txt contents into "file" scanner
		try {
	        File filename = new File("DataNames.txt");  // A file object just represents a path to a file
	        file = new Scanner(filename);    // Opens the file for reading (scanning)
		}
		catch(IOException e) {
			System.out.println("Welp. The file's borken. " + e);
		}
		
		//Generating and printing random data
		int count; 
		double chance;
		while(file.hasNextLine()) {
			count = (int) (Math.random()*1000);
			chance = Math.random()*100;
			System.out.println(file.nextLine() + " " + count + " " + chance);
		}


	}

}
