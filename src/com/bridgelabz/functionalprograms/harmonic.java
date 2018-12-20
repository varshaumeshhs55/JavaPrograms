package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
        System.out.println("enter the harmonic value");
        int num=sc1.nextInt();
        fu.harmonic(num);
		

	}
}

 