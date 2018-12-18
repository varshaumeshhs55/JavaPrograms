package com.bridgelabz.util;

import java.util.Random;

public class FunctionalUtility
{
	public void replaceString(String s1)
	
	{
	if(s1.length()<3)
	{
		System.out.println("enter a name greater than 3 alphabet");
}
	else
		System.out.println("hello "+s1+",how are you");
}





public void leapYear(int year)
{
	int i1=Integer.toString(year).length();
if(i1<4)
{
	System.out.println("enter the valid year");
}

else
{
	if(year%400==0 || year%100!=0 && year%4==0)
		
{
	System.out.println("the year is leap year");
	}
else
{
	System.out.println("the year is not leap year");
}
}
}






public void flipCoin(int num)
{
	int head=0,tail=0;
	int n=num;
	
	Random r=new Random();
	while(num>0)
	{
		int r1=r.nextInt(2);
		if(r1==0)
			head++;
		else
			tail--;
		num--;
	}
	System.out.println("percentage of head is "+head*100/n);
	System.out.println("percentage of tail is "+tail*100/n);
		
		
	
		
	}


public static void pow(double base,double exp)
{
	System.out.println(Math.pow(base, exp));
}





}





