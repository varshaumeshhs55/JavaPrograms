package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class Annagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlgorithmUtility au=new AlgorithmUtility();
		Scanner sc1=new Scanner(System.in); 
		System.out.println("enter 1st string");
		String str1=sc1.next();
		System.out.println("enter 2st string");
		String str2=sc1.next();
		boolean b=au.annagram(str1,str2);
		if(b)
		{
			System.out.println("the two string is an algorithm");
		}
		else
				
	        System.out.println("the two string is not an algorithm");
	}

}


	
	
	

		
	