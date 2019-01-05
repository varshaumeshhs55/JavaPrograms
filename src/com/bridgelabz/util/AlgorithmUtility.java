package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AlgorithmUtility {
	static Scanner scanner = new Scanner(System.in); // scanner class declaration

	// method for scanner class of integer type
	public static int readInteger() {
		return scanner.nextInt();
	}

	// method for scanner class of double type
	public static double readdouble() {
		return scanner.nextDouble();
	}

	/**
	 * static function to read boolean input from the user
	 * 
	 * @return boolean values that are read
	 */
	public static boolean readBoolean() {
		return scanner.nextBoolean();
	}

	// method for scanner class of String type
	public static String readString() {
		return scanner.next();
	}

	/**
	 * Static function to check if the two strings are anagram or not.
	 * 
	 * @param s1 the string to be checked for anagram
	 * @param s2 the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean annagrams(String s1, String s2) {

		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		int len1 = ch1.length;
		int len2 = ch2.length;
		if (len1 != len2) {
			return false;
		} else {
			ch1 = sortChar(ch1);
			ch2 = sortChar(ch2);
			String str1 = String.valueOf(ch1);
			String str2 = String.valueOf(ch2);

			boolean b = str1.equals(str2);
			{
				if (b == true)
					return true;
			}
		}
		return false;

	}

	// Anagram program continued

	/**
	 * @param ch is the character array input
	 * @returns sorted array
	 */
	public static char[] sortChar(char[] ch) {
		char[] c = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] < ch[j]) {
					count++;
				}
			}
			c[count] = ch[i];
		}
		return c;
	}

	/**
	 * static function to print the prime numbers for the given range
	 * 
	 */

	public static void primeNumber(int num) {
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

	/**
	 * static function that converts given temperature from celcius to fahrenheit
	 * and vice versa
	 * 
	 */
	float f = 0;
	float c = 0;

	public void convertFToC() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println();
		float f = sc1.nextFloat();
		c = (f - 32) * 5 / 9;
		System.out.println("temperature in celsius is: " + c);
		sc1.close();
	}

	public void convertCToF() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("please enter degrees C:");
		float c = sc1.nextFloat();
		f = (c * 9 / 5) + 32;
		System.out.println("temperature in Fahrenheit is: " + f);
		sc1.close();
	}

	/**
	 * static function that calculates the monthly payment
	 * 
	 * @param p the principle amount taken loan
	 * @param y the years to pay off
	 * @param r the interest rate
	 * @return monthly payment
	 */
	public static void monthlyPayment(double p, double r, double y) {
		double n = 12 * y;
		double v = r / 12 * 100;
		double payment = p * v / (1 - Math.pow(1 + v, -n));
		System.out.println("the monthly payment is: " + payment);
	}

	/**
	 * static function that calculates the square root of a given number
	 * 
	 * @param c the number whose square root is to be found
	 */
	public static void sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}

		System.out.println(t);
	}

// DayOfWeek
	/**
	 * static function that finds the day of the week provided date
	 * 
	 * @param month the numeric representation the of month
	 * @param date  the numeric representation the of date
	 * @param year  the numeric representation the of year
	 * @return integer the numeric representation of the day
	 */
	public static void dayOfWeek(int date, int month, int year) {
		{
			int year1 = year - (14 - month) / 12;
			int x = year1 + (year1 / 4) - (year1 / 100) + year1 / 400;
			int month1 = month + 12 * ((14 - month) / 12) - 2;
			int date1 = (date + x + 31 * month1 / 12) % 7;
			// }
			String str[] = { "Sunday", "Monday", "Tuesday", "wednesday", "Thursday", "Friday", "Sunday" };
			System.out.println(str[date1]);

		}
	}

	/**
	 * static function that converts decimal to binary
	 * 
	 * @param num the number that is to be converted to binary
	 * @return array the array of integers that contains binary bits of the number
	 */
	public static int[] toBinary(int n) {
		int i = 0;
		int binary[] = new int[100];
		while (n > 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}

		
		for (int j = 7; j >= 0; j--) {
			System.out.println(+binary[j]);
		}
	
		return binary;
	}

	/**
	 * static function to sort the given array of strings using insertion sort
	 * 
	 * @param str the array of strings that is to be sorted
	 * @param n   the number of strings to be sorted
	 * @return array the array of strings that are sorted
	 */
	public static String[] insertionSort(String[] str, int n) {
		for (int j = 1; j < n; j++) {
			String key = str[j];
			int i = j - 1;
			while (i >= 0 && (str[i].compareTo(key)) > 0) {

				str[i + 1] = str[i];
				i--;

			}

			str[i + 1] = key;
		}

		return str;
	}

	/**
	 * static function to merge the sorted arrays obtained from the merge function.
	 * 
	 * @param array the array of strings that are needed to be sorted
	 * @param low   the lower bound of the array
	 * @param high  the higher bound of the array
	 */
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

	public int binarySearch(int[] arr, int l, int h, int x) {
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, l, mid - 1, x);

		}
		return -1;

	}

	public static int binarySearchStr(String[] str, String key) {
		// int n=str.length;
		int first = 0;
		int last = str.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (str[middle].compareTo(key) < 0)
				first = middle + 1;
			else if (str[middle].compareTo(key) == 0) {
				return middle;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		return -1;
	}

	public static String[] sort(String[] str) {
		int len = str.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp;
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}

	public static int binarySearchStr1(String[] str, String key) {
		// int n=str.length;
		int first = 0;
		int last = str.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (str[middle].compareTo(key) < 0)
				first = middle + 1;
			else if (str[middle].compareTo(key) == 0) {
				return middle;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		return -1;
	}

	public static String[] sort1(String[] str) {
		int len = str.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if ((str[i].compareTo(str[j])) > 0) {
					String temp;
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;

	}

	public int[] insertionSortInteger(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;

	}

	public static int[] bubbleSortInteger(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static String[] bubbleSortString(String str[]) {
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = 1; j < str.length - i; j++) {
				if (str[j - 1].compareTo(str[j]) > 0) {
					String temp = str[j - 1];
					str[j - 1] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}

	public static Map<String, Double> mapCall(Map<String, Double> map) {
		Map<String, Double> sortMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> sortMap.put(x.getKey(), x.getValue()));
		return sortMap;

	}

	/**
	 * static function that used to swap nibble of a byte
	 * 
	 * @param x number number to be swapped
	 * @return integer integer that is swapped
	 */

	public static int swapNibbles(int x) {
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

	public static int[] toNibbleBinary(int n) {
		int i = 0;
		int binary[] = new int[100];
		while (n > 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}

//		for (int j = i - 1; j >= 0; j--) {
//			System.out.print(binary[j]);
//
//		}
		return binary;
	}

	/**
	 * 
	 * @param notes the array of possible notes in integers
	 * @param money the money that you need change for
	 * @return integer the minimum changes needed for the amount entered
	 */

    static int i = 0;
    static int value;
    public static int calculate(int money, int[] notes) {
        int rem;
        if (money == 0) {
            return value;
        } else {
            if (money >= notes[i]) {
                int calNotes = money / notes[i];
                rem = money % notes[i];
                money = rem;
                System.out.println(notes[i] + "rs Notes are  " + calNotes);
                value += calNotes;
            }
            i++;
            return calculate(money, notes);
        }

    }

	public static int binSearch(String[] str, String key) {
		// int n=str.length;
		int first = 0;
		int last = str.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (str[middle].compareTo(key) < 0)
				first = middle + 1;
			else if (str[middle].equalsIgnoreCase(key)) {
				return middle;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		return -1;
	}

	public static String[] sort2(String[] str) {
		int len = str.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp;
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}

	public static List<String> findPrime(int num) {
		int flag = 1;
		int i;
		List<String> arr = new ArrayList<>();
//    int count=0;

		for (i = 2; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			if (flag == 1) {
				arr.add(String.valueOf(i));
			}
		}
		System.out.println(arr);
		return arr;
	}

// anagram

	/**
	 * static function that is used to add prime numbers that are anagram
	 * 
	 * @param new_lst the list of prime numbers
	 * @return set of prime numbers that are anagram
	 */
	public static Set<String> primeAnagram(List<String> primeList) {
		Set<String> primeAnagramSet = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {

			for (int j = i + 1; j < primeList.size(); j++) {
				if (annagrams(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					// primeAnagramList.add(Integer.toString(i));
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i) + "    " + primeList.get(j));
				}
			}
		}

		return primeAnagramSet;

	}

//palindrom
	/**
	 * static function that is used to add prime numbers that are anagram and
	 * palindrom
	 * 
	 * @param set the set of prime numbers that are anagram
	 * @return set the set of prime numbers that are anagram and palindrom
	 */
//	public static Set<String> primePalindrome(Set<String> primeAnagramSet) {
//		java.util.Iterator<String> iter = primeAnagramSet.iterator();
//		Set<String> resultSet = new HashSet<>();
//
//		String a;
//		while (iter.hasNext()) {
//			a = (String) iter.next();
//			int a1 = Integer.parseInt(a);
//			int lk = reverse(a1);
//
//			if (primeAnagramSet.contains(Integer.toString(lk)))
//
//			{
//				String b = Integer.toString(lk);
//				resultSet.add(b);
//			}
//
//		}
//		return resultSet;
//	}
//
//	public static int reverse(int n) {
//
//		int reverse = 0;
//		while (n != 0) {
//			reverse = reverse * 10;
//			reverse = reverse + n % 10;
//			n = n / 10;
//		}
//		return reverse;
//	}
	public static Set<Integer> primePalindrome(List<String> arr) {
        Set<Integer> pal_set=new HashSet<>();
        Iterator<String> itr=arr.iterator();
        while(itr.hasNext()){
            String num=itr.next();
            if(isPalindrom(String.valueOf(num))){
                pal_set.add(Integer.valueOf(num));
            }
        }
        return pal_set;
    }
    public static boolean isPalindrom(String str){
        String new_str="";
        char[] array=str.toCharArray();
        for(int i=0;i<array.length;i++)
        {
            new_str=array[i]+new_str;
        }
        if(str.equals(new_str))
            return true;
        else
            return false;
    }

	

	/**
	 * static function that finds the number N that is guessed between the range of
	 * numbers such that the range is 2 to the power of N
	 * 
	 * @param low  the lower bound among the range of the numbers
	 * @param high the upper bound among the range of the numbers
	 * @return number the number that is guessed among the range of numbers
	 */
	public static int findANumber(int low, int high) {
		int mid = (low + high) / 2;
		if ((high - low) == 1) {
			System.out.println("Is your number lesser than or equal to " + mid + "? then type true else type false");
			boolean b = readBoolean();
			if (b == true)
				return low;
			else
				return high;
		}
		do {
			System.out.println("Is your number greater than or equal to " + mid + "? then type true else type false");
			boolean b = readBoolean();
			if (b == false) {
				return findANumber(low, mid);
			} else {
				return findANumber(mid + 1, high);
			}
		} while (low <= high);
	}

}