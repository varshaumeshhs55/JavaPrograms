
/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprograms.Distance 
 *  
 *  Purpose: Determines euclidean distance between two points.
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Distance {
	/*
	* The main function is written to take input from the user and
	* call distance function that calculates the euclidean distance
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
	  //Reading inputs from the user
	    System.out.println("enter x");
        int x=sc1.nextInt();
        System.out.println("enter y");
        int y=sc1.nextInt();
      //Method 1- using non-static function of FunctionalUtilty class
      		//of com.bridgelabz.util package
        fu.distance(x,y);
	}

}
