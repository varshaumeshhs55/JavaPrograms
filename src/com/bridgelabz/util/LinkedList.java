package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.DataStructureUtility.Node;

public class LinkedList {
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
	                insert1(list, name1);               
	            }
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	    System.out.println(list);
	    return list;
	}

	private static String readString() {
		// TODO Auto-generated method stub
		return null;
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
