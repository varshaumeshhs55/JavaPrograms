package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class LeapYear {
	public static void main(String[] args)
	{ 
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
	    System.out.println("enter the year");
        int year=sc1.nextInt();
        fu.leapYear(year);
        
		
	}

}
