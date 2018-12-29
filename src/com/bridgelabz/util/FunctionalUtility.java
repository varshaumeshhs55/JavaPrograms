package com.bridgelabz.util;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionalUtility<E>
{
	public static String replaceString(String str,String uname)
	{
	String message;
	Pattern p = Pattern.compile("<<UserName>>");
	Matcher m = p.matcher(str);
	message=m.replaceAll(uname);
	return message;
	
	 
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
	int i=0;
	int power=1;
	while(i<=exp)
	{
		System.out.println("2^"+i+"="+power);
		power=power*2;
		i++;
	}
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
//	while(n%2==0)
//	{
//		System.out.println(2+" ");
//		n=n/2;
//	}
//	for(int i=3;i*i<=n;i+=2)
//	{
//		while(n%i==0)
//		{
//			System.out.println(i+" ");
//			n=n/i;
//			
//		}
//	}
	for(int i=2;i<=n;i++)
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
	boolean found=false;
		 int count=0;
		 System.out.println("the output is");
	 for(int i=0;i<n-2;i++)
	 {
		 for(int j=i+1;j<n-1;j++)
		 {
			 for(int k=j+1;k<n;k++)
			 {
				 if(arr[i]+arr[j]+arr[k]==0)
				 {
					 
					 System.out.println(arr[i]+"+"+arr[j]+"+"+arr[k]+"= 0");
					 count++;
					 found=true;
				 }
				 
			 }
					
			 }
		 }
	 System.out.println("total no of possibilities are:"+count);
	 if(found==false)
	 {
		 System.out.println("sum of three integers does not add zero");
		 
	 }
}
 

//
public static void distance(int x,int y)
{
	double result=Math.sqrt(x*x+y*y);
System.out.println("result is "+result);
}




public void quadraticEquation(int a,int b,int c)
{
	double delta=b*b-4*a*c;
	if(delta>=0) {
	
       double root1 = (- b + Math.sqrt(delta))/(2*a);
       double root2 = (-b - Math.sqrt(delta))/(2*a);
       System.out.println("First root is:"+root1);
       System.out.println("Second root is:"+root2);
	
}else
{
	System.out.println("it is a imaginary number");
}
}




public void start()
{
	long startTime = 0;
	startTime = System.currentTimeMillis();
	System.out.println("the start time is:"+startTime);
}


public void stop()
{
	long stopTime = 0;
	 stopTime = System.currentTimeMillis();
	System.out.println("the stop time is:"+stopTime);
}

public void getElapsedTime()
{
	
	int stopTime = 0;
	int startTime = 0;
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
		 for(int j=0;j<garray[i].length;j++)
		 {
			 System.out.print(garray[i][j]+"  ");
		 }
		 System.out.println();
	 }
 }
 
 
/**
* player is a static variable that is initialized to 0
*/
static int player = 0;

/**
* BOARD is a static integer array whose size is 3x3 
*/
static int[][] BOARD = new int[3][3];

/**
* isEmpty is a static boolean variable that is initialized to 0
*/
static boolean isEmpty = true;
     
/**
	* static function that is used to initialize the BOARD
	*/
	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is x\nPlayer  is 0 ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -10;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}
	
	/**
	* static function that is used to display the board
	*/
	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o ||");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x ||");
				} else
					System.out.print("   ||");
			}
			System.out.println(" ");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}
	
	/**
	* static function that is used to enter 'X' or '0' into the board
	*/
	public static void putVal() {
		try{
			int i;
			int j;
			if (player % 2 == 1) {
				i = (int) (Math.random() * 10) % 3;
				j = (int) (Math.random() * 10) % 3;
			} else {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println("enter value of x and y by space");
				i = s.nextInt();
				j = s.nextInt();
			}
			if (BOARD[i][j] == -10) {
				if (player % 2 == 0) {
					BOARD[i][j] = 0;
				} else {
					BOARD[i][j] = 1;
					System.out.println("Coumputer Choosing " + i + " " + j);
				}
			} 
			else
			putVal();
		}catch(Exception e){
			System.out.println("Please enter value according to the matrix size");
			putVal();
		}

	}
	
	/**
	* static function that determines the winner of the game
	* @return true if won else false
	*/
	public static boolean win() {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	}

	/**
	* static function that has the definition to play the game
	*/
	public static void play() {
		initBoard();
		int count=0;
		while (isEmpty) {
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			count++;
			if(count<5){
				System.out.println("Computers turn");
				putVal();
				dispBoard();
				if (win()) {
					System.out.println("Computer won");
					return;
				}
			}
			else
				System.out.println("Its a draw");
			player = 0;
		}
	}
}



 
