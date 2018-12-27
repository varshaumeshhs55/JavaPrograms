
/******************************************************************************
 *  Compilation:  javac -d bin Power.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.Power
 *  
 *  Purpose: This program takes a command­line argument N and prints a table of the
 *  		 powers of 2 that are less than or equal to 2^N.
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Power {
	/*
	* The main function is written to take input from the user and
	* call pow function that prints the table of the powers of 2
	*/
	public static void main(String[] args)
	{
		
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
	    System.out.println("enter the power value of exponential");
	  //Reading the input from the user
	    double exp=sc1.nextDouble();
	    double base=2;
	    
	    
	    if(exp>31 ||exp<0)
	    
	    {
	    	System.out.println("overflows an int,enter valid exp");
	    }
	    
	    else
	    	//Method 1- using non-static function of FunctionalUtilty class
			//of com.bridgelabz.util package
	    	fu.pow(base, exp);

	}

}
