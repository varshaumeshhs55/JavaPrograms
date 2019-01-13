package com.bridgelab.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.MyGenericsStack;
import com.bridgelabz.util.NewQueue;

public class CalenderStack {
	
	    /*
	    * The main function is to take the input from the user
	    * and printing the calendar by using queue and stacks
	    */
	    public static void main(String[] args) throws Exception {
	        int month = Integer.parseInt(args[0]);
	        int year = Integer.parseInt(args[1]);
	        String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
	                "October", "November", "December" };
	        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	        if (month == 2 && DataStructureUtility.isLeapYear(year)) {
	            days[month] = 29;
	        }
	        System.out.println("\t\t " + months[month] + " " + year);
	        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
	        int d = DataStructureUtility.day(month, 1, year);
	        MyGenericsStack<NewQueue<Integer>> mainStack=new MyGenericsStack<NewQueue<Integer>>(1000);
	        NewQueue<Integer> queue=new NewQueue<>();
	        for (int i = 1; i <= days[month]; i++) {
	            queue.enqueue(i);
	            if (((i + d) % 7 == 0 || i==days[month]) ) {
	                mainStack.push(queue);
	                queue=new NewQueue<Integer>();
	                continue;
	            }
	        }   
	        for (int i = 0; i < d; i++)
	        System.out.print("\t");
	        int size = mainStack.size();
	        MyGenericsStack<NewQueue<Integer>>  stackNew = new  MyGenericsStack<NewQueue<Integer>>(1000);
	       
	        for(int i=0; i < size; i++){
	            stackNew.push(mainStack.pop());
	        }

	        for (int i = 0; i < size; i++) {
	            NewQueue<Integer> week = stackNew.pop();
	            for (int j = 0; j < week.getSize(); j++) {
	                System.out.print(week.dequeue() + "\t");
	            }
	            System.out.println();
	        }

	    }

	}


		



