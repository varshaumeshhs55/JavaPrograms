
/******************************************************************************
 *  Compilation:  javac -d bin StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.StopWatch 
 *  
 *  Purpose: Write a Stopwatch Program for measuring the time that elapses between
 *  		 the start and end clicks
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class StopWatch {
	/*
	* The main function is written to take input from the user and
	* call getElapsedTime function that measures elapsed time
	*/
	public static void main(String[] args) {
		
		FunctionalUtility fu=new FunctionalUtility();
        Scanner s = new Scanner(System.in);
	    System.out.println("enter 1 to start");
	    int  a = s.nextInt();
	    fu.start();
		System.out.println("Enter 2 to stop");
	    int b = s.nextInt();
	    fu.stop();
		System.out.println("Enter 3 to getElapsedTime");
		int c= s.nextInt();
		//Method 1- using non-static function of FunctionalUtilty class
				//of com.bridgelabz.util package
		fu.getElapsedTime();
	}
	
         
}

