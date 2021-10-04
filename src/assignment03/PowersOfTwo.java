/**
 * This class is used to print out the powers of 2 from 0 to 16
 *
 * @author  Austin Li
 * @version September 10, 2021
 */

package assignment03;

public class PowersOfTwo {

	public static void main(String[] args) {
		
		int count = 0;
		int val = 1;
		
		while(count < 17) {
			System.out.println(val);
			val = val*2;
			count++;
		}

	}

}
