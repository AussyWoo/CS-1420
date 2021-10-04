/*
 * CSCI 295 Fall 2021
 * Homework 4 Question 2
 * Scott Osmundson (0762593)
*/
package test;

import java.util.Scanner;

public class Homework4_2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String phrase = keyboard.nextLine();
		
		phrase = phrase.substring(0,1).toUpperCase() + phrase.substring(1).toLowerCase();
		
		System.out.println("The new phrase is:\n" + phrase);
	}
}
