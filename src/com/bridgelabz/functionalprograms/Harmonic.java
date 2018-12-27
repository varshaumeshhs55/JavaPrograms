
/******************************************************************************
 *  Compilation:  javac -d bin Harmonic.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.HarmonicNumber 
 *  
 *  Purpose: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 *  
 *  @author Varsha Umesh
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Harmonic {
	/*
	* The main function is written to take input from the user and
	* call harmonic function that prints harmonic value
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
        System.out.println("enter the harmonic value");

		//Reading the input from the user
        int num=sc1.nextInt();
      //Method 1- using non-static function of FunctionalUtilty class
      		//of com.bridgelabz.util package
        fu.harmonic(num);
		

	}
}

 