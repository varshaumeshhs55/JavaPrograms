
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

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class FindANumber {
	/*
	* The main function is written to take input from the user and
	* calls findANumber function to guess the answer with n questions
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au = new AlgorithmUtility();
		Scanner sc1 = new Scanner(System.in);
		//Reading input number from the user
		System.out.println("Enter any Number:");
		int n = sc1.nextInt();
		int range = (int) (Math.pow(2, n)); // range calculation for the number
		System.out.println("Take number between '0' to " + (range - 1));
		int count = 0;
		String input1 = null;
		int lower = 0;
		int upper = range;
		int middle = (lower + upper / 2);
		//Method 1- using static function of AlgorithmUtility class of
				//com.bridgelabz.util package
		au.findANumber(lower, upper, middle, count, input1, n);
	}

}
