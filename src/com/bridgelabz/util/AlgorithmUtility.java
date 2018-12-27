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
		double payment = p * v / (1 - Math.pow(1 + v, -n));
		System.out.println("the monthly payment is: " + payment);
	}

	public void sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}

// DayOfWeek
	public void dayOfWeek(int date, int month, int year) {
		{
			int year1 = year - (14 - month) / 12;
			int x = year1 + (year1 / 4) - (year1 / 100) + year1 / 400;
			int month1 = month + 12 * ((14 - month) / 12) - 2;
			int date1 = (date + x + 31 * month1 / 12) % 7;
			// }
			String str[] = { "Sunday", "Monday", "Tuesday", "wednesday", "Thursday", "Friday", "Sunday" };
			for (int i = 0; i < str.length; i++) {
				if (i == date1)
					System.out.println("the day is " + str[i]);
			}
		}
	}

	public static void toBinary(int n) {
		int[] binarynum = new int[1000];

		int i = 0;
		while (n > 0) {
			binarynum[i] = n % 2;
			n = n / 2;
			i++;

		}
		System.out.println(i);
		for (int j = i - 1; j >= 0; j--)
			System.out.println(+binarynum[j]);
	}

	public String[] insertionSort(String[] str, int n) {
		for (int j = 1; j < n; j++) {
			String key = str[j];
			int i = j - 1;
			while (i >= 0) {
				if ((str[i].compareTo(key)) > 0)
					str[i + 1] = str[i];
				i--;
				break;

			}

			str[i + 1] = key;
		}

		return str;
	}

	public static void mergeSort(String array[], int low, int high) {
		int n = high - low;
		if (n <= 1)
			return;
		int mid = low + n / 2;
		mergeSort(array, low, mid);
		mergeSort(array, mid, high);
		String[] temparr = new String[n];
		int i = low, j = mid;
		for (int k = 0; k < n; k++) {
			if (i == mid)
				temparr[k] = array[j++];
			else if (j == high)
				temparr[k] = array[i++];
			else if (array[j].compareToIgnoreCase(array[i]) < 0)
				temparr[k] = array[j++];
			else
				temparr[k] = array[i++];
		}

		for (int k = 0; k < n; k++) {
			array[low + k] = temparr[k];
		}
	}

	public static int findANumber(int lower, int upper, int middle, int count, String input1, int n) {
		Scanner rc = new Scanner(System.in);
		System.out.println("Is your number:" + middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input1 = rc.nextLine();
		do {
			if (input1.equals("high")) {
				lower = middle + 1;
				count++;
			} else if (input1.equals("yes")) {
				System.out.println("The number you thought was: " + middle);
				int no = count + 1;
				System.out.println("It takes " + no + " times to find your exact number");
				break;
			}

			else if (input1.equals("low")) {
				upper = middle - 1;
				count++;
			}
			if (count < n) {
				middle = (lower + upper + 1) / 2;
				System.out.println("Is your number " + middle + ":");
				input1 = rc.nextLine();
			}
		} while (lower <= upper);
		if (count > n) {
			System.out.println("Number not found");
		} else {
			System.exit(0);
		}
		return middle;
	}

  public int binarySearch(int[] arr, int l, int h, int x) {
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
		    return binarySearch(arr, l, mid-1, x); 
			
			return binarySearch(arr, l, mid-1, x); 
			
		}
		return -1;

	}

public static int binarySearchStr(String [] str,String key)
{
    //int n=str.length;
    int first  = 0;
    int last   = str.length - 1;
    int middle = (first + last)/2;

    while( first <= last )
    {
      if ( str[middle].compareTo(key)<0 )
        first = middle + 1;    
      else if ( str[middle].compareTo(key)==0 )
      {
       return middle;
      }
      else
         last = middle - 1;

      middle = (first + last)/2;
   }
 return -1;
}

public static String []  sort(String [] str)
{
    int len=str.length;
    for (int i = 0; i < len; i++){
        for (int j = i+1; j < len; j++) {
            if (str[i].compareTo(str[j])>0) {
                String temp;
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
    return str;
}

public static int binarySearchStr1(String [] str,String key)
{
    //int n=str.length;
    int first  = 0;
    int last   = str.length - 1;
    int middle = (first + last)/2;

    while( first <= last )
    {
      if ( str[middle].compareTo(key)<0 )
        first = middle + 1;    
      else if ( str[middle].compareTo(key)==0 )
      {
       return middle;
      }
      else
         last = middle - 1;

      middle = (first + last)/2;
   }
 return -1;
}

public static String []  sort1(String [] str)
{
    int len=str.length;
    for (int i = 0; i < len; i++){
        for (int j = i+1; j < len; j++) {
            if ((str[i].compareTo(str[j]))>0) {
                String temp;
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
    return str;

}

public int [] insertionSortInteger(int arr[]) 
{ 
    int n = arr.length; 
    for (int i=1; i<n; ++i) 
    { 
        int key = arr[i]; 
        int j = i-1; 

        /* Move elements of arr[0..i-1], that are 
           greater than key, to one position ahead 
           of their current position */
        while (j>=0 && arr[j] > key) 
        { 
            arr[j+1] = arr[j]; 
            j = j-1; 
        } 
        arr[j+1] = key; 
    }
	return arr;

}


public static int[] bubbleSortInteger(int array[])
{
    for(int i=0;i<array.length-1;i++)
    {
        for( int j=1;j<array.length-i;j++)
        {
            if(array[j-1]>array[j])
            {
                int temp=array[j-1];
                array[j-1]=array[j];
                array[j]=temp;
            }
        }
    }
    return array;
}



public static String[] bubbleSortString(String str[])
{
for(int i=0;i<str.length-1;i++)
{
    for( int j=1;j<str.length-i;j++)
    {
        if(str[j-1].compareTo(str[j])>0)
        {
            String temp=str[j-1];
            str[j-1]=str[j];
            str[j]=temp;
        }
    }
}
return str;
}
    

public static int swapNibbles(int x)
{
    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
}

public static int[] toNibbleBinary(int n) {
    int i=0;
    int binary[]=new int[100];
    while(n>0)
    {
        binary[i]=n%2;
        n=n/2;
        i++;
    }

    for(int j=i-1;j>=0;j--)
    {
        System.out.print(binary[j]);

    }
    return binary;
}

static int i=0;
static int total=0;
static int money;
public  int calculate(int money,int[]notes )
{
    int rem;
    if(money==0)
    {
        return -1 ;
    }
    else
    {
        if(money>=notes[i])
        {
            int calNotes =money/notes[i];
            rem = money%notes[i];
            money =rem;
            total += calNotes;
            System.out.println(notes[i]+   "rs Notes are  " +calNotes );
        }
        i++;
        return calculate(money, notes);

    }
}


public static int binSearch(String [] str,String key)
{
    //int n=str.length;
    int first  = 0;
    int last   = str.length - 1;
    int middle = (first + last)/2;

    while( first <= last )
    {
      if ( str[middle].compareTo(key)<0 )
        first = middle + 1;    
      else if ( str[middle].equalsIgnoreCase(key) )
      {
       return middle;
      }
      else
         last = middle - 1;

      middle = (first + last)/2;
   }
 return -1;
}
public static String []  sort2(String [] str)
{
    int len=str.length;
    for (int i = 0; i < len; i++){
        for (int j = i+1; j < len; j++) {
            if (str[i].compareTo(str[j])>0) {
                String temp;
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
    return str;
}
}