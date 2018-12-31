package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class UnOrderedList {
	public static void main(String[] args) throws FileNotFoundException {
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
	                AlgorithmUtility.sort2(tokens);
	                for(int i=0;i<tokens.length;i++) {
	                    System.out.println(tokens[i]);
	                }
	            }
	}catch (Exception e) {
		// TODO: handle exception
	}

	}}


