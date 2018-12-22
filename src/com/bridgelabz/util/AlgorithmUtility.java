package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {

	public boolean annagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;

		} else {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			for (int i = 0; i < str1.length(); i++) {
				if (ch1[i] != ch2[i])
					return false;
			}
			return true;

		}
	}

	public void primeNumber(int num) {
		for (int i = 2; i < num; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}

			}
			if (k == 0)
				System.out.print(i + "   ");
		}
	}

	float f = 0;
	float c = 0;

	public void convertFToC() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println();
		float f = sc1.nextFloat();
		c = (f - 32) * 5 / 9;
		System.out.println("temperature in celsius is: " + c);
	}

	public void convertCToF() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("please enter degrees C:");
		float c = sc1.nextFloat();
		f = (c * 9 / 5) + 32;
		System.out.println("temperature in Fahrenheit is: " + f);
	}

	public void monthlyPayment(double p, double r, double y) {
		double n = 12 * y;
		double v = r / 12 * 100;
		double payment = p * v /( 1 - Math.pow(1 + v,- n));
		System.out.println("the monthly payment is: "+payment);
	}


public void sqrt(double c)
{
	double t=c;
	double epsilon = 1e-15; 
	while (Math.abs(t - c/t) > epsilon*t) {
        t = (c/t + t) / 2.0;
    }
   
    System.out.println(t);
}

	

// DayOfWeek
public void dayOfWeek(int date,int month,int year)
{
            {
    int year1= year-(14-month)/12;
    int x = year1+(year1/4)-(year1/100)+year1/400;
    int month1 = month+12*((14-month)/12)-2;
    int date1= (date+x+31*month1/12)%7;
    //            }
    String str []= {"Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Sunday"};
    for(int i=0;i<str.length;i++)
    {
        if(i==date1) 
            System.out.println("the day is"+str[i]);
    }
}
}
}

