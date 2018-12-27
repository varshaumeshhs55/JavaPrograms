
/******************************************************************************
 *  Compilation:  javac -d bin  FileBinarySearch.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprograms. FileBinarySearch
 *  Purpose: Read in a list of words from File. Then prompt the user to enter a word to
 *  		 search the list. The program reports if the search word is found in the list.
 *
 *  @author  Varsha Umesh
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class FileBinarySearch {
	/*
	* The main function is written to take input from the user and
	* calls binSearch function to search word from list
	*/
	

		// TODO Auto-generated method stub
		 
		    public static void main(String[] args) throws FileNotFoundException {
	        AlgorithmUtility au=new AlgorithmUtility();
		        Scanner sc = new Scanner(System.in);
		        // Get scanner instance
		        String csvFile = "/home/admin1/Desktop/varsha1.csv";
		        BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));

		        // Delimiter used in CSV file
		        final String DELIMITER = ",";
		        try {
		            String line = "";
		            // fileReader = new BufferedReader(new FileReader(csvFile));
		            // Read the file line by line
		            while ((line = fileReader.readLine()) != null) {
		                // Get all tokens available in line
		                String[] tokens = line.split(DELIMITER);
		                au.sort2(tokens);
//		                for(int i=0;i<tokens.length;i++) {
//		                    System.out.println(tokens[i]);
//		                }
		                for (String token : tokens) {
		                    // Print all tokens
		                    System.out.println(token);
		                }
		                System.out.println("enter the key word which has to be searched ");
		                String key = sc.next();
		                int i = au.binSearch(tokens, key);
		                if (i >= 0) {
		                    System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
		                } else
		                    System.out.println(key + " doesnot exists in the given csv file");
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
//		        finally {
//		            try {
//		                fileReader.close();
//		            } catch (Exception e) {
//		                e.printStackTrace();
//		            }
		        }
		    }

		



