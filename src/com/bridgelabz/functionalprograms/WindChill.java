package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalUtility fu=new FunctionalUtility();
	    Scanner sc1=new Scanner(System.in);
        System.out.println("enter temperaure:");
        double t=sc1.nextDouble();
        System.out.println("enter windspeed:");
        double v=sc1.nextDouble();
        if(t<50 && v>3 || v<120)
        {

            fu.windChill(t,v);
        }
        else
        {
        	System.out.println("enter valid temperature and windspeed");
        }

	}

}
