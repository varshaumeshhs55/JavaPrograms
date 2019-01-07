/******************************************************************************
 *  Compilation:  javac -d bin CalenderQueue .java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.CalenderQueue  n
 *  
 *  Purpose: �> Create the Week Object having a list of WeekDay objects each 
 *  			storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . 
 *  			The WeekDay objects are stored in a Queue implemented using 
 *  			Linked List. Further maintain also a Week Object in a Queue to
 *  			finally display the Calendar
 *
 *  @author Varsha Umesh
 *  @version 1.0
 *  @since   05-01-2019
 *
 ******************************************************************************/

package com.bridgelab.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.NewQueue;

public class CalenderQueue {
	/*
	* The main function is to take the input from the user 
	* and printing the calendar by using queue 
	*/
    public static void main(String[] args) {
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
        NewQueue<NewQueue<Integer>> mainQueue=new NewQueue<NewQueue<Integer>>();
        NewQueue<Integer> queue2=new  NewQueue<Integer>();
       
       
        for (int i = 1; i <= days[month]; i++) {
            queue2.enqueue(i);
            if (((i + d) % 7 == 0 || i==days[month]) ) {
                mainQueue.enqueue(queue2);
                queue2=new NewQueue<Integer>();
                }
        }   
        for (int i = 0; i < d; i++)
        System.out.print("\t");
        for(int i=0;i<=mainQueue.getSize();i++)
        {
        	 NewQueue<Integer> week=mainQueue.dequeue();
            for(int j=0;j<week.getSize();j++)
            {
                System.out.print(week.dequeue()+"\t");
            }
            System.out.println();
        }
    }
}
