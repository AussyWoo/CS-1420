/**
 * This program plays a simple game of rock-paper-scissors (roshambo)
 * with the user.  (Students will complete this program as part of
 * lab #2.)  See the lab instructions.
 * 
 * Peter Jensen and (student name here)
 * August 31, 2021
 */
package lab02;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		// Create a Scanner object.

		Scanner keyboard = new Scanner(System.in);

		// Create two String variables. Name them computerWord and userWord.
		// Initialize them to empty strings.

		String computerWord, userWord;
		computerWord = userWord = "";

		// Make a random integer between [0...2]. If the random integer is a
		// 0, set computerWord to "rock", if it's a 1, set computerWord
		// to "paper", otherwise set computerWord to "scissors".

		int computerPick = (int) (Math.random() * 3);
		if (computerPick == 0)
			computerWord = "rock";
		else if (computerPick == 1)
			computerWord = "paper";
		else if (computerPick == 2)
			computerWord = "scissors";

		// Using a Boolean flag, create an input loop that asks the player to enter
		// their guess. Print reasonable instructions. Don't allow the program
		// to proceed until the player enters either "rock", "paper", or "scissors".
		// Store it in userWord.

		Boolean validInput = false;
		System.out.println("Please enter 'rock', 'paper', or 'scissors'.");

		while (!validInput) {
			System.out.print("Your choice: ");
			userWord = keyboard.nextLine();

			if (userWord.equals("rock"))
				validInput = true;
			else if (userWord.equals("paper"))
				validInput = true;
			else if (userWord.equals("scissors"))
				validInput = true;
			else
				System.out.println(
						"The word you entered is not a valid, please enter either 'rock', 'paper', or 'scissors'.");
		}

		// Print out the user's guess: "You picked rock.", etc.
		// Print out the computer's guess: "I picked rock.", etc.

		System.out.println("You picked " + userWord + ".");
		System.out.println("I picked " + computerWord + ".");

		// Write a few 'if' statements to determine the result of the game and
		// print out the winner: "I win", "You win", "It's a tie"
		// If the strings are the same, its a tie.
		// else if the player picks "rock" and the computer picks "scissors", the player
		// wins,
		// else if ... (etc.)

		//Compares cases if user chose "rock"
		if (userWord.equals("rock")) {
			if (computerWord.equals("scissors"))
				System.out.println("You win!");
			if (computerWord.equals("rock"))
				System.out.println("It's a tie.");
			if (computerWord.equals("paper"))
				System.out.println("I win!");
		}
		
		//Compares cases if user chose "paper"
		else if (userWord.equals("paper")) {
			if (computerWord.equals("scissors"))
				System.out.println("You win!");
			if (computerWord.equals("paper"))
				System.out.println("It's a tie.");
			if (computerWord.equals("rock"))
				System.out.println("I win!");
		}
		
		//Compares cases if user chose "scissors"
		else if (userWord.equals("scissors")) {
			if (computerWord.equals("rock"))
				System.out.println("You win!");
			if (computerWord.equals("scissors"))
				System.out.println("It's a tie.");
			if (computerWord.equals("paper"))
				System.out.println("I win!");
		}

	}
}
