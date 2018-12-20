package com.bridgelabz.util;

import java.util.Random;

public class FunctionalUtility<E>
{
	public void replaceString(String str,String uname)
	
	{
	if(uname.length()<3)
	{
		System.out.println("enter a name greater than 3 alphabet");
}
	else 
	{
		String str2=str.replace("<<UserName>>",uname);
		System.out.println(str2);
}

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


public void harmonic(double num)

{
	 double result=0.0;
	 for(double i=1;i<=num;i++)
	 {
		 result=result+1/i;
		 
	 }
	 System.out.println( result);
}






public void primeFactors(int n)

{
	while(n%2==0)
	{
		System.out.println(2+" ");
		n=n/2;
	}
	for(int i=3;i*i<=n;i+=2)
	{
		while(n%i==0)
		{
			System.out.println(i+" ");
			n=n/i;
			
		}
	}
}
		

public void gambler(int stake,int goal,int n)
{
	int wins=0;
	int loss=0;
	 for (int t = 0; t < n; t++) 
	 {

        
         int cash = stake;
         while (cash > 0 && cash < goal)
         {
          
             if (Math.random() < 0.5) 
            	 cash++; 
             else               
            	 cash--;    
         }
         if (cash == goal)
        	 wins++;           
     }

     System.out.println(wins + " wins of " + n);
     System.out.println("Percent of games wins= " + 100.0 * wins / n);
     System.out.println("Percent of games loss = " + 100.0 * loss / n);
}


	 public static int collect(int n)
	 {
	        boolean[] isCollected = new boolean[n];
	        int count = 0;                           
	        int distinct  = 0;   
	        while(distinct<n)
	        {
	        	int value=(int) (Math.random() * n);
	        	count++;
	        	if(isCollected[value]==false)
	        	{
	        		distinct++;
	        		System.out.println(distinct);
	        		isCollected[value]=true;
	        	}
	        	

	      
	        
	        }
	        return count;
	    }
	 
	 //
	 public void sumOfThreeInt(int[] arr,int n)
 {
	//boolean found=false;
		 int count=0;
	 for(int i=0;i<n-2;i++)
	 {
		 for(int j=i+1;j<n-1;j++)
		 {
			 for(int k=j+1;k<n;k++)
			 {
				 if(arr[i]+arr[j]+arr[k]==0)
				 {
					 System.out.println("the output is");
					 System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"= 0");
					 count++;
				 }
				 
			 }
					
			 }
		 }
	 if(count==0)
	 {
		 System.out.println("sum of three integers does not add zero");
		 
	 }
}
 

//
public void distance(int x,int y)
{
	double result=Math.sqrt(x*x+y*y);
System.out.println("result is "+result);
}




public void quadraticEquation(int a,int b,int c)
{
	double delta=b*b-4*a*c;
       double root1 = (- b + Math.sqrt(delta))/(2*a);
       double root2 = (-b - Math.sqrt(delta))/(2*a);
       System.out.println("First root is:"+root1);
       System.out.println("Second root is:"+root2);
	
}


long startTime=0;
long stopTime=0;

public void start()
{
	startTime=System.currentTimeMillis();
	System.out.println("the start time is:"+startTime);
}


public void stop()
{
	stopTime=System.currentTimeMillis();
	System.out.println("the stop time is:"+stopTime);
}

public void getElapsedTime()
{
	System.out.println(stopTime-startTime);

	
	
	
	
	
}

public void windChill(double t,double v)
{
	double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
	System.out.println("wind chill:"+w);
}



	
 public void displayArray(E[][] garray)
 {
	 for(int i=0;i<garray.length;i++)
	 {
		 for(int j=0;j<garray.length;j++)
		 {
			 System.out.print(garray[i][j]+"  ");
		 }
		 System.out.println();
	 }
 }
 }
 
 
 
