package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class StockCompanyApplication {
	
	public static void main(String[] args) throws IOException {
     
        int c=0;
            do{
                System.out.println("Enter the choice- "
                    + "(If you're new) 1-Create Account (If you're regular) 2-Open Account  3-Quit");
                int choice = OopsUtility.readInteger();
                switch (choice) {
                case 1:
                   
                    //Method 1- using non-static function of StockAccount class
                    //of com.bridgelabz.oops package
                  StockAccount.creatAccount();
                  
                    break;
                case 2:
                   
                    //Method 2- using non-static function of StockAccount class
                    //of com.bridgelabz.oops package
                    StockAccount.openAccount();
                   
                   
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

                }
            }while(c<30);
        }
}

	
