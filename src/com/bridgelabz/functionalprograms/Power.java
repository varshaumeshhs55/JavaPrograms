package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Power {

	public static void main(String[] args)
	{
		
		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
	    System.out.println("enter the power value of exponential");
	    double exp=sc1.nextDouble();
	    double base=2;
	    
	    
	    if(exp>31 ||exp<0)
	    
	    {
	    	System.out.println("overflows an int,enter valid exp");
	    }
	    
	    else
	    	fu.pow(base, exp);

	}

}
