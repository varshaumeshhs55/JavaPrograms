package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class QuadraticEquation {
	public static void main(String[] args) {
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner s = new Scanner(System.in);
	    System.out.println("Given quadratic equation:ax^x + bx + c");
	    System.out.print("Enter a:");
	    int  a = s.nextInt();
	    System.out.print("Enter b:");
	    int b = s.nextInt();
	    System.out.print("Enter c:");
	    int c = s.nextInt();
	    fu.quadraticEquation(a,b,c);
		  
		
	}

}
