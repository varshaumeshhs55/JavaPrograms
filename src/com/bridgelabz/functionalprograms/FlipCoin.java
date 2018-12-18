package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class FlipCoin {
	public static void main(String[] args) 
	{
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
        System.out.println("enter the number of times to flip");
        int num=sc1.nextInt();
        fu.flipCoin(num);
		
	}

}
