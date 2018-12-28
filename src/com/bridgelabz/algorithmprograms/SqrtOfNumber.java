
/******************************************************************************
 *  Compilation:  javac -d bin SqrtOfNumber.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.SqrtOfNumber
 *  
 *  Purpose: Finds the square root of the given number using Newton's Method
 *
 *  @author Varsha Umesh
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class SqrtOfNumber {
	/*
	 * The main function is written to take input from the user and call sqrt
	 * thefunction that finds square root of a number
	 */
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("enter the number to find its squareroot");

		double c = sc1.nextDouble();
		AlgorithmUtility.sqrt(c);
		sc1.close();

	}
}