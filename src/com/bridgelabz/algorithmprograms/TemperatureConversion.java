
/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms.TemperatureConversion 
 *  
 *  Purpose: Converts the temperture given to Fahrenheit or Celcius temperature
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class TemperatureConversion {

	/*
	* The main function is written to take input from the user and
	* call the tempConversion function that converts temperature
	*/

	public static void main(String[] args) {
		AlgorithmUtility au=new AlgorithmUtility();
		// TODO Auto-generated method stubAlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		//Reading the choice of the user
		System.out.println("press 1 to convert F to C or  2 to convert C to F");
		//Reading the input from the user
		int a=sc1.nextInt();
		if(a==1)
		{
			//Method 1- using static function of AlgorithmUtility class of
			//com.bridgelabz.util package
		au.convertFToC();
		}	
		else
		au.convertCToF();
	}
	
		
		
		

	}

