package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class SqrtOfNumber {
	public static void main(String[] args) {
		
	
	AlgorithmUtility au=new AlgorithmUtility();
	Scanner sc1=new Scanner(System.in); 
	System.out.println("enter the number to find its squareroot");
	double c=sc1.nextDouble();
	au.sqrt(c);

}
}