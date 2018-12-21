package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class TemperatureConversion {

	public static void main(String[] args) {
		AlgorithmUtility au=new AlgorithmUtility();
		// TODO Auto-generated method stubAlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		System.out.println("press 1 to convert F to C or  2 to convert C to F");
		int a=sc1.nextInt();
		if(a==1)
		{
		au.convertFToC();
		}	
		else
		au.convertCToF();
	}
	
		
		
		

	}

