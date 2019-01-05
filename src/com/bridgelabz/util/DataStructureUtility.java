package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class DataStructureUtility {
	Node head; // head of list
	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		String data;
		Node next;

		// Constructor
		Node(String token)
		{
			data = token;
			next = null;
		}
	}
	public static DataStructureUtility insert(DataStructureUtility list, String String)
	{
		// Create a new node with given data
		Node new_node = new Node(String);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	public static void printList(DataStructureUtility list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		while (currNode != null) {
			if(currNode.data!=null)
				System.out.println(currNode.data + " ");
			currNode = currNode.next;
		}
	}
	public static int delete(DataStructureUtility list,String key)
	{
		int flag=0;
		Node currNode = list.head;       
		while(currNode != null)
		{
			if(currNode.data!=null)
			{
				if((currNode.data).compareToIgnoreCase(key)==0) {
					currNode.data=null;   
					System.out.println("entered "+key+" found and deleted");
					flag=1; 
					break;
				}
			}
			currNode = currNode.next;
		}

		return flag;           
	}
	public static void FileWriter(DataStructureUtility list,String[] fileContent,String path) throws IOException
	{
		//String[] fileContent = DataStructureUtility.toStrinConv(list);
		FileWriter fileWriter = new FileWriter(path);   
		for(String s:fileContent)
		{
			if(s!=null) {
				fileWriter.write(s);
				fileWriter.write(" ");
			}
		}
		fileWriter.close();
	}

	public static String[] toStrinConv(DataStructureUtility list)
	{
		Node currNode = list.head;
		int i=0;
		String[] str =new String[1000];
		while (currNode != null) {
			if(currNode.data!=null)
				str[i]=currNode.data ;
			i++;
			currNode = currNode.next;
		}
		return str;
	}
	static Scanner scanner=new Scanner(System.in);
	public static int readInteger() {
		return scanner.nextInt();
	}   
	public static double readdouble() {
		return scanner.nextDouble();
	}
	public static String readString() {
		return scanner.next();
	}
	public static void dispFile( String fname)
	{
		String line = null;
		try
		{
			FileReader fileReader = new FileReader(fname);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}
			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file named '" + fname + "'");
		}

	}


/* Return true if expression has balanced  
Parenthesis */
public static List<Integer> primeN(int a,int b) {
	List<Integer> li1=new ArrayList<Integer>();
	for (int i = a; i < b; i++) {
		int k = 0;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				k = 1;
				break;
			}

		}
		if (k == 0)
		{
//			System.out.print(i + "   ");
			li1.add(i);
		}
	}
	return li1;
}
public static Set<Integer> primeAnagram(List<Integer> primeList) {
Set<Integer> primeAnagram = new HashSet<>();
	
        for (int i = 0; i < primeList.size(); i++) {
            for (int j = i+1; j < primeList.size(); j++) {
                if (AlgorithmUtility.annagrams(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
                    primeAnagram.add(primeList.get(i));
                    primeAnagram.add(primeList.get(j));
                }
            }
        }
        return primeAnagram;
    }


public static void printPrimeAndAnagram(List<List<Integer>> li1)
{
    List<Integer> demo = new ArrayList<Integer>();
    for (int i = 0; i < li1.size(); i++) {
        demo = li1.get(i);
        if (i == 0) {
            System.out.println("Numbers which are prime and anagram are:"+demo.size());
            System.out.println();
            for (int j = 0; j < demo.size(); j++) {
                System.out.print(demo.get(j) + " ");
            }
        } else {
            System.out.println("Numbers which are prime but not anagram are:"+demo.size());
            System.out.println();
            for (int j = 0; j < demo.size(); j++) {
                System.out.print(demo.get(j) + " ");
            }
        }
        System.out.println();
    }
}


/** Print the calendar for a month in a year */

public static void printMonth(int year, int month) {

//Print the headings of the calendar
 printMonthTitle(year, month);

//Print the body of the calendar
 printMonthBody(year, month);
}

/** Print the month title, e.g., May, 1999 */

static void printMonthTitle(int year, int month) {

System.out.println("         " + getMonthName(month) + " " + year);
System.out.println("–––––––––––––––––––––––––––––");
System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

}

/** Get the English name for the month */
static String getMonthName(int month) {
//	month--;
 String mnth[]= {"","jan","feb","march","april","may","june","july","august","september","oct","novem","dec"};
 return mnth[month];
}

/** Print month body */
static void printMonthBody(int year, int month) {

 // Get start day of the week for the first date in the month
 int startDay = getStartDay(year, month);

 // Get number of days in the month
 int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

 // Pad space before the first day of the month
 int i = 0;
 for (i = 0; i < startDay; i++)
   System.out.print("    ");
 for (i = 1; i <= numberOfDaysInMonth; i++) {
   if (i < 10)
     System.out.print("   " + i);
   else
     System.out.print("  " + i);
   if ((i + startDay) % 7 == 0)
     System.out.println();
 }
 System.out.println();
}

/** Get the start day of the first day in a month */

static int getStartDay(int year, int month) {

 //Get total number of days since 1/1/1800
 int startDay1800 = 3;
 int totalNumberOfDays = getTotalNumberOfDays(year, month);

 //Return the start day
 return (totalNumberOfDays + startDay1800) % 7;
}

/** Get the total number of days since January 1, 1800 */

static int getTotalNumberOfDays(int year, int month) {
int total = 0;

//Get the total days from 1800 to year - 1
for (int i = 1800; i < year; i++)
if (isLeapYear(i))
   total = total + 366;
 else
   total = total + 365;

 //Add days from January to the month prior to the calendar month
 for (int i = 1; i < month; i++)
   total = total + getNumberOfDaysInMonth(year, i);

 return total;
}

/** Get the number of days in a month */

static int getNumberOfDaysInMonth(int year, int month) {
 if (month == 1 || month == 3 || month == 5 || month == 7 ||
   month == 8 || month == 10 || month == 12)
   return 31;

 if (month == 4 || month == 6 || month == 9 || month == 11)
   return 30;

 if (month == 2) return isLeapYear(year) ? 29 : 28;

 return 0; // If month is incorrect
}

/** Determine if it is a leap year */
static boolean isLeapYear(int year) {
 return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
}

public static CustQueue AnagramPrime(List<Integer> primeList) {
//  Set<Integer> primeAnagram = new HashSet<>();
CustQueue q=new CustQueue(1000);
  for (int i = 0; i < primeList.size(); i++) {
      for (int j = i+1; j < primeList.size(); j++) {
          if (AlgorithmUtility.annagrams(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
              q.insert(primeList.get(i));
              q.insert(primeList.get(j));
          }
      }
  }
  return q;
}

public static DataStructureUtility readFile(DataStructureUtility list)
{
    System.out.println("Enter the path of the file");
    String csvFile = readString();
    //String csvFile="/home/admin1/Desktop/Files/example.txt";
    String line = " ";
    String name[]=new String[1000];
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
    {
        while ((line = br.readLine()) != null)
        {
            name = line.split(" ");
            for(int i=0;i<name.length;i++){
                String name1=name[i];
                insert(list, name1);               
            }
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println(list);
    return list;
}

public static void printList1(DataStructureUtility list)
{
    Node currNode = list.head;
    System.out.print("LinkedList: ");
    while (currNode != null) {
        if(currNode.data!=null)
            System.out.println(currNode.data + " ");
        currNode = currNode.next;
    }
}

public static int delete1(DataStructureUtility list,String key)
{
    int flag=0;
    Node currNode = list.head;       
    while(currNode != null)
    {
        if(currNode.data!=null)
        {
            if((currNode.data).compareToIgnoreCase(key)==0) {
                currNode.data=null;   
                System.out.println("entered "+key+" found and deleted");
                flag=1;       
            }
        }
        currNode = currNode.next;
    }

    return flag;           
}

public static DataStructureUtility insert1(DataStructureUtility list, String str)
{
    // Create a new node with given data
    Node new_node = new Node(str);
    //new_node.next = null;
    if (list.head == null) {
        list.head = new_node;
    }
    else {
        Node last = list.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }
    return list;
}

public static int[] toIntConv(DataStructureUtility list)
{
    int kz=0;
    Node currNode = list.head;
    int i=0;
    int[] str =new int[1000];
    while (currNode != null) {
        if(currNode.data!=null)    {
            kz=Integer.parseInt(currNode.data);
            str[i]=kz;
            i++;

        }
        currNode = currNode.next;
    }
    return str;
}

public static int[] stringSort(int[] myArray) {
    for(int i = 0; i<myArray.length-1; i++) {
        for (int j = i+1; j<myArray.length-1; j++) {
            if(myArray[i]!=0 && myArray[j]!=0 ) {
                if(myArray[i]>myArray[j]){
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }
    return myArray;
}

public static String[] intTostring(int[] abc) {
    String strarray[]=new String[abc.length];
    int l=0;
    for(int i=0;i<abc.length;i++) {
        if(abc[i]!=0) {
        String str=String.valueOf(abc[i]);
        strarray[l]=str;
        l++;
    }}
    return strarray;
}


public static void usingFileWriter(DataStructureUtility list,String[] fileContent,String path) throws IOException
{
    //String[] fileContent = DataStructureUtility.toStrinConv(list);
    FileWriter fileWriter = new FileWriter(path);   
    for(String s:fileContent)
    {
        if(s!=null) {
            fileWriter.write(s);
            fileWriter.write(" ");
        }
    }
    fileWriter.close();
}

public static void dispFile1( String fname)
{
    String line = null;
    try
    {
        FileReader fileReader = new FileReader(fname);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }
        bufferedReader.close();
    }
    catch(IOException ex)
    {
        System.out.println("Error reading file named '" + fname + "'");
    }
}

}
