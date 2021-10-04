/*
 * This program will process data the three parameters of data available about Concerning Car Noises and determine which ones are high risk.
 * 
 * @author  Austin Li
 * @version September 14, 2021
 */

package quiz01;

import java.util.Scanner;

public class AnalyzeData {

	public static void main(String[] args) {
		//Initializing Scanners and Variables
		Scanner keyboard = new Scanner(System.in);
		int count, entryNum;
		double chance;
		String sound;
		
		//Unique variables for this assignment
		int frequent = 0;
		int risk = 0;
		String list = "[";
		
		//Ask user for # of entries
		System.out.println("Welcome to this program! Our goal is to be very practical.");
		System.out.print("Please enter the amount of entries: ");
		entryNum = keyboard.nextInt();
		
		//Ask user for data
		for(int i = 0; i < entryNum; i++) {
			System.out.print("Concerning Sound: ");
			sound = keyboard.next();
			System.out.print("# of occurrences: ");
			count = keyboard.nextInt();
			System.out.print("% chance: ");
			chance = keyboard.nextDouble();
			
			//Data is tallied if the occurrences are higher than 500 or the chances are higher than 50%
			if(count > 500) {
				frequent++;
			}
			if(chance > 50) {
				risk++;
			}
			
			//Forming the final list of "high risk" sounds (where a sound either occurs frequently or has a high likelihood of occurring)
			if(count > 500 || chance > 50) {
				if(i != 0) list += ", " + sound;
				else list += sound;
			}
		}
		
		//Final print statements
		System.out.println("\nNumber of sounds that occur frequently: " + frequent);
		System.out.println("Number of sounds that have a high likelihood of occurring: " + risk);
		System.out.print("List of sounds that are \"high risk\": " + list + "]");
	}

}
