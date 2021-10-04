/**
 * This class implements the ability to convert seconds to hours, minutes, and seconds
 *
 * @author  Austin Li
 * @version August 26, 2021
 */

package assignment01;

public class TimeCalculation {

	public static void main(String[] args) {
		
		//Declaring uID
		int uID = 1364758;
		
		//Calculates seconds by finding the remainder when divided by 60 (whatever can't go into a whole minute)
		int seconds = uID % 60;
		
		//Calculates minutes by finding the left over seconds when divided 3600 (the number of seconds in an hour), then dividing by 60 to convert seconds to minutes
		int minutes = (uID % 3600) / 60;
		
		//Calculates hours by dividing by the number of seconds in an hour
		int hours = uID / (60*60);
		
		//Print statements
		System.out.println("My uID number is u" + uID + ".");
		System.out.println(uID + " seconds is " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s).");
	}

}
