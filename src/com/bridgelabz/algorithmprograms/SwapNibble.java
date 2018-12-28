
/******************************************************************************
 *  Compilation:  javac -d bin SwapNibble.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.SwapNibble
 *  
 *  Purpose: To read an integer as an Input, convert to Binary using toBinary
 *  		 function and perform the following functions:
 * 			 	i. Swap nibbles and find the new number.
 *  			ii. Find the resultant number is the number is a power of 2
 *
 *  @author Varsha Umesh
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class SwapNibble {
	/*
	 * The main function is written to take input from the user and calls
	 * swapNibbles function to find the result after swapping nibbles
	 */

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int flag = 0;

		System.out.println("enter the Value of n");
		int a = sc1.nextInt();

		int c = AlgorithmUtility.swapNibbles(a);
		System.out.println(c);

		int[] d = AlgorithmUtility.toNibbleBinary(c);
		for (int j = 7; j >= 0; j--) {
			System.out.print(d[j]);
		}

		for (int i = 1; i < c; i++) {

			if (Math.pow(2, i) == c)
				flag = 1;

		}
		if (flag == 1)
			System.out.println("number is power of 2");

		else
			System.out.println("number is not a power of 2");

		sc1.close();
	}

}
