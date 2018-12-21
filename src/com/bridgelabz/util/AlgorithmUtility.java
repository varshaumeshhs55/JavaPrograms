package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {
	
public boolean annagram(String str1,String str2)
{
	
	if(str1.length()!=str2.length())
	{
		return false;
	
	}
	else
	{   char[] ch1=str1.toLowerCase(
			).toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	
	
		for(int i=0;i<str1.length();i++)
		{
			if(ch1[i]!=ch2[i])
			    return false; 
	}
		return true;
		
	
	
	}
}




public void primeNumber(int num)
{
	for( int i=2;i<num;i++) 
	{
	       int k=0;
	         for(int j=2;j<i;j++)
	         {
	                  if(i%j==0)
	                  {
	                  k=1;
	                  break;
	         }
	         if(k==0)
	         System.out.print(i+"   ");
	}
	}
}




float f=0;
float c=0;
public void convertFToC()
{   Scanner sc1=new Scanner(System.in); 
	System.out.println("please enter degrees F:");
	float f=sc1.nextFloat();
	c=(f - 32) * 5/9  ;
	System.out.println("temperature in celsius is: "+c);
}
 

public void convertCToF()
{ Scanner sc1=new Scanner(System.in); 
  System.out.println("please enter degrees C:");
  float c=sc1.nextFloat();
  f=(c * 9/5) + 32;
  System.out.println("temperature in Fahrenheit is: "+f);
}
}
 

	



