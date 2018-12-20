package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PrimeFactors {

	public static void main(String[] args) {
		
		// TODO Auto-generated method 

		FunctionalUtility fu=new FunctionalUtility();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc1.nextInt();
		fu.primeFactors(n);
		
		

	}

}
