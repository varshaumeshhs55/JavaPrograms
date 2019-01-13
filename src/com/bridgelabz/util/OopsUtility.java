package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OopsUtility {
static Scanner scanner=new Scanner(System.in); //scanner class declaration
    
    //method for scanner class of integer type
    public static int readInteger() {
          return scanner.nextInt();}
    
    //method for scanner class of double type
    public static double readdouble() {
                    return scanner.nextDouble();}
    /**
	 * static function to read boolean input from the user
	 * @return boolean values that are read
	 */
	public static Float readFloat(){
			return scanner.nextFloat();
	}
	
        
    //method for scanner class of String type
    public static String readString() {
                    return scanner.next();}
    public static String readFile(String message) throws FileNotFoundException {
        FileReader f = new FileReader(message);
        @SuppressWarnings("resource")
        BufferedReader read = new BufferedReader(f);
        String line = "";
        try {
            String word="";
            while ((word = read.readLine()) != null) {
                line = word;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }
//Regex

public static String modifiedMessage(String name,String fullname,String mobileno, String date,String Message) {
    final String Regex_1="<{2}name>{2}";
    final String Regex_2="<{2}fullname>{2}";
    final String Regex_3="<{2}x{10}>{2}";
    final String Regex_4="\\d{2}+/+\\d{2}+/+\\d{4}";           

    Pattern p = Pattern.compile(Regex_1);
    Matcher m = p.matcher(Message);
    Message = m.replaceAll(name);
   
    Pattern p1=Pattern.compile(Regex_2);
    Matcher m1=p1.matcher(Message);
    Message = m1.replaceAll(fullname);
   
    Pattern p2=Pattern.compile(Regex_3);
    Matcher m2=p2.matcher(Message);
    Message = m2.replaceAll(mobileno);
   
    Pattern p3=Pattern.compile(Regex_4);
    Matcher m3=p3.matcher(Message);
    Message = m3.replaceAll(date);
   
    return Message;
}



    public static String currentDate()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);
        return strDate;
        }
        
	

//    public static void write(String json) throws IOException
//    {
//        FileWriter fw = new FileWriter("/home/admin1/Documents/adiga_docs/Programs/Files/json1.json");
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(json);
//        bw.flush();
//    }
    public static InventoryList insertInventoryList(String inventoryName,List<Inventory> listOfInventories)
    {
        InventoryList inventoryList = new InventoryList();
        inventoryList.setInventoryName(inventoryName);
        inventoryList.setListOfInventories(listOfInventories);
        return inventoryList;
    }
    static List<Inventory> liInventories = new ArrayList<Inventory>();
    public static List<Inventory> insertInventory(String name,float weight,double price)
    {
        Inventory inventory = new Inventory();
        inventory.setName(name);
        inventory.setWeight(weight);
        inventory.setPrice(price);
        liInventories.add(inventory);
        return liInventories;
    }
   
    public static void display(List<InventoryList> list2)
    {
        for (int i = 0; i < list2.size(); i++) {
            InventoryList it = list2.get(i);
            System.out.println("Inventory name :" + it.getInventoryName());
            for (int j = 0; j < it.getListOfInventories().size(); j++) {
                System.out.println("name :" + it.getListOfInventories().get(j).getName());
                System.out.println("price :" + it.getListOfInventories().get(j).getPrice());
                System.out.println("weight :" + it.getListOfInventories().get(j).getWeight());
                System.out.println();
            }
            System.out.println("---------------------------------------------");
    }
       
    }
    public static Inventory insertInventoryDetail()
    {
        Inventory inventory = new Inventory();
        System.out.println("Enter name of inventory");
        inventory.setName(OopsUtility.readString());
        System.out.println("Enter weight of inventory in kilograms");
        inventory.setWeight(OopsUtility.readFloat());
        System.out.println("Enter price of inventory in rupees");
        inventory.setPrice(OopsUtility.readdouble());
        return inventory;
    }
   
    public static void price(List<InventoryList> list2)
    {
       
        for (int i = 0; i < list2.size(); i++) {
            InventoryList it = list2.get(i);
            System.out.println("Inventory name :" + it.getInventoryName());
            for (int j = 0; j < it.getListOfInventories().size(); j++) {
                System.out.println("name :" + it.getListOfInventories().get(j).getName());
                double sum=it.getListOfInventories().get(j).getPrice()*it.getListOfInventories().get(j).getWeight();
                System.out.println("total price to be given is :"+sum);
            }
            System.out.println("---------------------------------------------");
    }
    }
    public static void writeFile(String json,String fileName) throws IOException
    {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(json);
        bw.flush();
    }
}
	
