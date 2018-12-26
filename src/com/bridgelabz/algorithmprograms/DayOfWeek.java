package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.FunctionalUtility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
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
