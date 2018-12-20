package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class StopWatch {
	public static void main(String[] args) {
		
		FunctionalUtility fu=new FunctionalUtility();
        Scanner s = new Scanner(System.in);
	    System.out.println("enter 1 to start");
	    int  a = s.nextInt();
	    fu.start();
		System.out.println("Enter 2 to stop");
	    int b = s.nextInt();
	    fu.stop();
		System.out.println("Enter 3 to getElapsedTime");
		int c= s.nextInt();
		fu.getElapsedTime();
	}
	
         
}

