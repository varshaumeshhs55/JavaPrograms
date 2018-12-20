package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
        System.out.println("enter the stake");
        int stake=sc1.nextInt();
        System.out.println("enter the goal");
        int goal=sc1.nextInt();
        System.out.println("enter the no of times");
        int n=sc1.nextInt();
        fu.gambler(stake,goal,n);
        
        
        
   }

}
