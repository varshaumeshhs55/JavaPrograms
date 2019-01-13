package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	public static boolean readBoolean(){
			return scanner.nextBoolean();
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
        }}
        
	


