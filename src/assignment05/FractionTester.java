/**
 * This class tests all standard methods within the Fraction class for accuracy
 *
 * @author  Austin Li
 * @version October 4, 2021
 */

package assignment05;

public class FractionTester {

	public static void main(String[] args) {
		Fraction sixThirds = new Fraction(6, 3);
		Fraction oneFourth = new Fraction(1, 4);
		Fraction five = new Fraction(5);
		Fraction fourSixths = new Fraction(4, 6);
		Fraction nThreeFourths = new Fraction(15,-20);
		
		
		boolean correct = true;
		
		// Simplification tests
		if(sixThirds.getNumerator() != 2) correct = false;
		
		if(oneFourth.getNumerator() != 1) correct = false;
		
		if(five.getNumerator() != 5) correct = false;
		
		if(fourSixths.getNumerator() != 2) correct = false;
		
		if(nThreeFourths.getNumerator() != -3) correct = false;
		
		// Add tests
		if(sixThirds.add(oneFourth).getNumerator() != 9) correct = false;
		if(sixThirds.add(oneFourth).getDenominator() != 4) correct = false;
		
		if(oneFourth.add(five).getNumerator() != 21) correct = false;
		if(oneFourth.add(five).getDenominator() != 4) correct = false;

		if(oneFourth.add(nThreeFourths).getNumerator() != -1) correct = false;
		if(oneFourth.add(nThreeFourths).getDenominator() != 2) correct = false;
		
		if(fourSixths.add(oneFourth).getNumerator() != 11) correct = false;
		if(fourSixths.add(oneFourth).getDenominator() != 12) correct = false;
		
		//Subtract tests
		if(sixThirds.subtract(oneFourth).getNumerator() != 7) correct = false;
		if(sixThirds.subtract(oneFourth).getDenominator() != 4) correct = false;
		
		if(oneFourth.subtract(five).getNumerator() != -19) correct = false;
		if(oneFourth.subtract(five).getDenominator() != 4) correct = false;

		if(oneFourth.subtract(nThreeFourths).getNumerator() != 1) correct = false;
		if(oneFourth.subtract(nThreeFourths).getDenominator() != 1) correct = false;
		
		if(fourSixths.subtract(oneFourth).getNumerator() != 5) correct = false;
		if(fourSixths.subtract(oneFourth).getDenominator() != 12) correct = false;
		
		//Multiply tests
		if(sixThirds.multiply(oneFourth).getNumerator() != 1) correct = false;
		if(sixThirds.multiply(oneFourth).getDenominator() != 2) correct = false;
		
		if(oneFourth.multiply(five).getNumerator() != 5) correct = false;
		if(oneFourth.multiply(five).getDenominator() != 4) correct = false;

		if(oneFourth.multiply(nThreeFourths).getNumerator() != -3) correct = false;
		if(oneFourth.multiply(nThreeFourths).getDenominator() != 16) correct = false;
		
		if(fourSixths.multiply(oneFourth).getNumerator() != 1) correct = false;
		if(fourSixths.multiply(oneFourth).getDenominator() != 6) correct = false;
		
		//Divide tests
		if(sixThirds.divide(oneFourth).getNumerator() != 8) correct = false;
		if(sixThirds.divide(oneFourth).getDenominator() != 1) correct = false;
		
		if(oneFourth.divide(five).getNumerator() != 1) correct = false;
		if(oneFourth.divide(five).getDenominator() != 20) correct = false;

		if(oneFourth.divide(nThreeFourths).getNumerator() != -1) correct = false;
		if(oneFourth.divide(nThreeFourths).getDenominator() != 3) correct = false;
		
		if(fourSixths.divide(oneFourth).getNumerator() != 8) correct = false;
		if(fourSixths.divide(oneFourth).getDenominator() != 3) correct = false;
		
		//Double tests
		if(sixThirds.toDouble() != 2.0) correct = false;
		
		if(oneFourth.toDouble() != 0.25) correct = false;

		if(five.toDouble() != 5.0) correct = false;
		
		if(fourSixths.toDouble() != 0.6666666666666666) correct = false;
		
		if(nThreeFourths.toDouble() != -0.75) correct = false;
		
		//String tests
		if(!sixThirds.toString().equals("2/1")) correct = false;
		
		if(!oneFourth.toString().equals("1/4")) correct = false;

		if(!five.toString().equals("5/1")) correct = false;
		
		if(!fourSixths.toString().equals("2/3")) correct = false;
		
		if(!nThreeFourths.toString().equals("-3/4")) correct = false;
		
		
		//Final print statement
		if(correct) {
			System.out.println("All tests completed, no errors.");
		}
		else {
			System.out.println("All tests completed, errors found.");
		}
		

	}

}
