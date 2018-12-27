
/******************************************************************************
 *  Compilation:  javac -d bin ToBinary.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.ToBinary 
 *  
 *  Purpose: Converts the given decimal number to binary number.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;



public class ToBinary {
	/*
	* The main function is written to take input from the user and
	* call the toBinary function that converts decimal to binary
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in); 
		System.out.println("enter the decimal number");
		//Reading the input from the user
		int n=sc1.nextInt();
		//Method 1- using static function of AlgorithmUtility class of
				//com.bridgelabz.util package
		AlgorithmUtility.toBinary(n);

	}

}
