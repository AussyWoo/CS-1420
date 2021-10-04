/**
 * This class holds all the methods to process fractions.
 *
 * @author  Austin Li
 * @version October 4, 2021
 **/

package assignment05;

public class Fraction {
	private long numerator;
	private long denominator;

	public Fraction(long n, long d) {
		// Moves the negative symbol to the numerator if needed
		if (d < 0) {
			this.numerator = n * -1;
			this.denominator = d * -1;
		}
		else {
			this.numerator = n;
			this.denominator = d;
		}

		long gcd = getGCD(Math.abs(n), Math.abs(d));
		this.numerator = this.numerator / gcd;
		this.denominator = this.denominator / gcd;

	}

	public Fraction(long n) {
		this.numerator = n;
		this.denominator = 1;
	}

	/**
	 * Adds any two given fractions
	 *
	 * @param rightHandSide The term that will be added
	 * @return The result of the fraction + rightHandSide
	 */
	public Fraction add(Fraction rightHandSide) {
		long lcm = getLCM(Math.abs(this.denominator), Math.abs(rightHandSide.denominator));
		long tempNum = this.numerator * (lcm / this.denominator);
		long tempNumR = rightHandSide.numerator * (lcm / rightHandSide.denominator);
		return new Fraction(tempNum + tempNumR, lcm);
	}

	/**
	 * Subtracts any two given fractions
	 *
	 * @param rightHandSide The term that will be subtracted
	 * @return The result of the fraction - rightHandSide
	 */
	public Fraction subtract(Fraction rightHandSide) {
		long lcm = getLCM(this.denominator, rightHandSide.denominator);
		long tempNum = this.numerator * (lcm / this.denominator);
		long tempNumR = rightHandSide.numerator * (lcm / rightHandSide.denominator);
		return new Fraction(tempNum - tempNumR, lcm);
	}

	/**
	 * Multiplies any two given fractions
	 *
	 * @param rightHandSide The term that the fraction will be multiplying by
	 * @return The result of the fraction * rightHandSide
	 */
	public Fraction multiply(Fraction rightHandSide) {
		return new Fraction(this.numerator * rightHandSide.numerator, this.denominator * rightHandSide.denominator);
	}

	/**
	 * Divides any two given fractions
	 *
	 * @param rightHandSide The term that the fraction will be dividing by
	 * @return The result of the fraction / rightHandSide
	 */
	public Fraction divide(Fraction rightHandSide) {
		return this.multiply(new Fraction(rightHandSide.getDenominator(), rightHandSide.getNumerator()));
	}

	/**
	 * Getter class for the numerator
	 *
	 * @return The numerator of the fraction
	 */
	public long getNumerator() {
		return this.numerator;
	}

	/**
	 * Getter class for the denominator
	 *
	 * @return The denominator of the fraction
	 */
	public long getDenominator() {
		return this.denominator;
	}

	/**
	 * Finds the lowest common multiple of two numbers
	 *
	 * @param one The first number to be considered
	 * @param two The second number to be considered
	 * @return The denominator of the fraction
	 */
	private long getLCM(long one, long two) {
		long count1 = 2;
		long count2 = 2;
		long temp1 = one;
		long temp2 = two;
		while (temp1 != temp2) {
			if (temp1 > temp2) {
				temp2 = two * count1;
				count1++;
			} else {
				temp1 = one * count2;
				count2++;
			}

		}
		return temp1;
	}

	/**
	 * Finds the greatest common denominator of two numbers
	 *
	 * @param n The first number to be considered
	 * @param d The second number to be considered
	 * @return The denominator of the fraction
	 */
	private long getGCD(long n, long d) {
		// Compute the greatest common divisor of x and y using a
		// well-known algorithm.

		long gcd = n;
		long remainder = d;
		long temp;

		while (remainder != 0) {
			temp = remainder;
			remainder = gcd % remainder;
			gcd = temp;
		}

		return gcd;
	}

	public double toDouble() {
		double d = (double)this.numerator;
		double n = (double)this.denominator;
		return d/n;
	}

	/**
	 * Prints out the fraction
	 *
	 * @return The fraction as a string
	 */
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

}
