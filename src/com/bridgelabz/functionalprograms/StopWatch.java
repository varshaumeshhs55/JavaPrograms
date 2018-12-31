
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
		
		  FunctionalUtility u=new FunctionalUtility();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Press any integer to Start Time: ");
	        sc.nextInt();
	       
	        long startTimer=FunctionalUtility.startTime();
	       

	       
	        System.out.println("Press any integer to Stop Time: ");
	        sc.nextInt();
	       
	       long stopTimer=FunctionalUtility.stopTime();
	       System.out.println("Stop Time is: "+stopTimer);

	        //calling the method
	        long l=FunctionalUtility.elapsedTime(stopTimer,startTimer);
	   
	        System.out.println("Total Time Elapsed is:"+(l/1000)+" sec");
	       
	       
	       
	    }
	    
	}
	
         

