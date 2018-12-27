
/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.functionalprogram.WindChill 
 *  
 *  Purpose: Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
 *  		 to calculate effective temperature (the wind chill)
 *  
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class WindChill {
	/*
	* The main function is written to take input from the user and
	* call WindChill function that calculates the effective temperature
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
	  //Reading the inputs from the user
        System.out.println("enter temperaure:");
        double t=sc1.nextDouble();
        System.out.println("enter windspeed:");
        double v=sc1.nextDouble();
        if(t<50 && v>3 || v<120)
        {
        	//Method 1- using non-static function of FunctionalUtilty class
    		//of com.bridgelabz.util package
            fu.windChill(t,v);
        }
        else
        {
        	System.out.println("enter valid temperature and windspeed");
        }

	}

}
