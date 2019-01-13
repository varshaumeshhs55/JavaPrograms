package com.bridgelab.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.bridgelabz.util.FunctionalUtility;
import com.bridgelabz.util.LinkedList;


	
	public class HashingFunction {

	    /*
	     * The main function is to read from a file and use hash numbers to find the
	     * searched data.
	     */
	    public static <E> void main(String[] args) throws NumberFormatException, IOException {
	        // Customized LinkedList
	        LinkedList<Integer> linkedList = new LinkedList<>();
	        LinkedList<Integer> linkedListnew = null;
	        LinkedList<Integer> linkedListint = new LinkedList<>();
	        int n = 0;
	        Map<Integer,  LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
	        for (int i = 0; i <= 10; i++) {
	            linkedListnew = new LinkedList<>();
	            map.put(i, linkedListnew);
	        }
	        FileReader file = new FileReader("/home/admin1/Desktop/varsha4.csv");
	        @SuppressWarnings("resource")
	        BufferedReader buffer = new BufferedReader(file);
	        FileWriter writer = new FileWriter("/home/admin1/Desktop/varsha4.csv", true);
	        @SuppressWarnings("unused")
	        BufferedWriter bufferwriter = new BufferedWriter(writer);
	        int reminder;
	        String read;
	        String delimitor = " ";
	        while ((read = buffer.readLine()) != null) {
	            String tokens[] = read.split(delimitor);
	            for (String token : tokens) {
	                linkedList.add(Integer.parseInt(token));
	            }
	        }
	        System.out.println("The numbers in the file are:");
	        linkedList.printNew();
	        System.out.println();
	        int len = linkedList.size();
	        int[] arr = linkedList.convInteger(linkedList, len);
	        int[] arr2 = linkedList.sortArray(arr);
	        System.out.println("after sorting:");
	        for (int i : arr2) {
	            linkedListint.add(i);
	        }
	        linkedListint.printNew();
	        System.out.println();
	        System.out.println("Dividing each number by 11 and storing set");
	        for (int i = 0; i < arr2.length; i++) {
	            reminder = arr2[i] % 11;
	            if (map.isEmpty()) {
	                linkedListnew.add(arr2[i]);
	                map.put(reminder, linkedListnew);
	            } else {
	                linkedListnew = map.get(reminder);
	                if (linkedListnew.size() == 0) {
	                    linkedListnew.add(arr2[i]);
	                } else {
	                    if (!linkedListnew.search(arr2[i])) {
	                        linkedListnew.add(arr2[i]);
	                    }
	                }
	                map.put(reminder, linkedListnew);
	            }
	        }

	        for (int i = 0; i < map.size(); i++) {
	            LinkedList<Integer> list = map.get(i);
	            System.out.print(i + ": ");
	            list.printNew();
	            System.out.println();
	        }

	        do {
	            System.out.println();
	            System.out.println("1.Enter the integer value to be to be searched");
	            System.out.println("2.Exit the program and display the file ");
	            int choice = LinkedList.readInteger();
	            switch (choice) {
	            case 1:
	                System.out.println("enter the word to be searched from sorted list:");
	                int key = LinkedList.readInteger();
	                int length = linkedListint.size();
	                System.out.println(length);
	                boolean value = linkedListint.findIntegerValue(length, key, linkedListint);
	                if (value) {
	                    System.out.println("name found");
	                    System.out.println("number is removed from the file ");
	                    System.out.println("new file list is :");
	                    linkedListint.printNew();
	                } else {
	                    System.out.println("name not found");
	                    System.out.println("seached number added to file ");
	                    linkedListint.printNew();
	                }
	                break;

	            case 2:
	                FileOutputStream update = new FileOutputStream("/home/admin1/Desktop/HashingFile");
	                update.write(("").getBytes());
	                update.close();
	                int len2 = linkedListint.size();
	                linkedListint.printNew();
	                int[] Str = linkedListint.convertInt(linkedListint, len2);
	                String[] newStringArray = new String[Str.length];
	                for (int i = 0; i < Str.length; i++) {
	                    newStringArray[i] = String.valueOf(Str[i]);
	                }
	                for (int i = 0; i < newStringArray.length; i++) {
	                    writer.write(newStringArray[i]);
	                    writer.write(" ");
	                }
	                writer.flush();
	                writer.close();
	                System.exit(0);
	                break;
	            default:
	                System.out.println("please select correct choice");
	                break;
	            }

	            n++;
	        } while (n < 30);
	}

	    }




		
