package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		System.out.println("enter principal loan ammount");
		double p=sc1.nextDouble();
		System.out.println("enter percent compound interest");
		double r=sc1.nextDouble();
		System.out.println("enter years to pay off");
		double y=sc1.nextDouble();
		au.monthlyPayment(p,r,y);
	}

}
