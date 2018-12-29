
/******************************************************************************
 *  Compilation:  javac -d bin FindANumber.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.FindANumber
 *  
 *  Purpose: Takes a command�line argument N, asks you to think of a number
 *  		 between 0 and N�1, where N = 2^n, and always guesses the answer with n
 *  		 questions.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class FindANumber {

	public static void main(String[] args) {
		/*
		 * The main function is written to take input from the user and calls
		 * findANumber function to guess the answer with n questions
		 */
		System.out.println("Enter number ");

		// Reading input number from the user
		int num = AlgorithmUtility.readInteger();

		int limit = (int) Math.pow(2, num);

		System.out.println("Guess a number between 0 and " + limit);

		// Method 1- using static function of AlgorithmUtility class of
		// com.bridgelabz.util package
		int gnum= AlgorithmUtility.findANumber(0, limit);

		System.out.println("Your number is " + gnum);
	}

}
