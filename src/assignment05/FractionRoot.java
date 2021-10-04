/**
 * This class utilizes the Fraction class to approximate the square root of fractions
 *
 * @author  Austin Li
 * @version October 4, 2021
 */

package assignment05;

import java.util.Scanner;

public class FractionRoot {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This class will run an algorithm to a specified amount of cycles to approximate the square root of a fraction. \nFractions do not need to be simplified.");
		System.out.print("Please enter the numerator: ");
		long n = keyboard.nextLong();
		System.out.print("Please enter the denominator: ");
		long d = keyboard.nextLong();
		System.out.print("Please enter the approximation cycle count: ");
		int approx = keyboard.nextInt();
		
		Fraction frac = new Fraction(n,d);
		Fraction sqrt = frac.divide(new Fraction(2,1));
		Fraction half = new Fraction(1,2);
		
		for(int i = 0; i < approx; i++) {
			sqrt = half.multiply(sqrt.add(frac.divide(sqrt)));
		}
		
		System.out.println("The square root of " + frac + " is approximately " + sqrt + ".");
		System.out.println("Or about " + sqrt.toDouble());

	}

}
