package com.bridgelabz.datastructureprograms;

import java.util.Queue;

import com.bridgelabz.util.CustQueue;
import com.bridgelabz.util.DataStructureUtility;

public class BankingProblem {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		DataStructureUtility q= new DataStructureUtility();
		
//		int n=DataStructureUtility.readInteger();
		CustQueue q1=new CustQueue(100);
		int money=100000;
		int ch = 0;
		do
		{ 
			System.out.println();
		   	System.out.println("------------Banking Cash Counter-----------");
		   	System.out.println("1.enter the people to add to the queue");
		   	System.out.println("2.available balance");
		   	System.out.println("3.Exit");
		   	System.out.println();
		   	System.out.println("Enter your choice: ");
		   	int choice=q.readInteger();
		   	switch (choice) 
		   	{
		   	case 1: q1.insert(ch++);
		   	        System.out.println("person added to queue");
		   	        System.out.println("select choice 1.deposit 2.withdraw");
		   	        int value=q.readInteger();
		            switch (value) 
		            { 
		   	case 1:   		
		   		    System.out.println("Enter the amount you want to Deposit");
			   		int cash=DataStructureUtility.readInteger();
			   		money+=cash;
//			   		System.out.println("available balance is: "+(money+cash));
			   		System.out.println("amount credited to your account");
			   		break;
		   	case 2:
			   		System.out.println("Enter the amount you want to Withdraw ");
					int cash1=DataStructureUtility.readInteger();
					money=money-cash1;
					System.out.println("amount debited from your account");
//			   		System.out.println(" Your Available Balance is: "+money); 
			   		
			   		break;
		            }
		            q1.remove();
		            System.out.println("person removed from queue");
		           break;
			case 2:

					System.out.println("the cashier balance is: "+money);	
					break;
		   	case 3:
			   		System.exit(0);
			   		break;
		   	default: 
			   		System.out.println("You entered wrong choice");
			   		break;
		   	}
	   	}
		while(ch<5);
	}		

	}


