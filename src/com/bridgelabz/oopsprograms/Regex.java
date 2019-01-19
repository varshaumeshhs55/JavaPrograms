package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class Regex {

	    public static void main(String[] args) throws IOException {
	        String file ="/home/admin1/vasa3.txt";
	        String Message=OopsUtility.readFile(file);
	            System.out.println("Enter the name");
	            String firstname=OopsUtility.readString();
	            System.out.println("Enter the last name");
	            String lastname=OopsUtility.readString();
	            String fullname=firstname + lastname;
	            System.out.println("Enter the mobile number");
	            String mobileNo=OopsUtility.readString();
	            String date=OopsUtility.currentDate();
	          String modifiedmsg=OopsUtility.modifiedMessage(firstname,fullname,mobileNo,date,Message);
	          System.out.println( modifiedmsg);
	}}




