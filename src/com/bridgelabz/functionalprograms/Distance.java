
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
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalUtility;

public class Distance {
	/*
	 * The main function is written to take input from the user and call distance
	 * function that calculates the euclidean distance
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String i = args[0];
		String j = args[1];
		int x = Integer.parseInt(i);
		int y = Integer.parseInt(j);

		// Method 1- using non-static function of FunctionalUtilty class
		// of com.bridgelabz.util package
		FunctionalUtility.distance(x, y);
	}

}
