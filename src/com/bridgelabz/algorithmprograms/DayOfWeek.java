package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		System.out.println("enter the date");
		int date=sc1.nextInt();
		System.out.println("enter the month");
		int month=sc1.nextInt();
		System.out.println("enter the year");
		int year=sc1.nextInt();
		au.dayOfWeek(date,month,year);

	}

}
