package com.bridgelabz.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockPortfolio {

	public static List<Stock> liOfStock = new ArrayList<Stock>();
    static Stock stock = new Stock();
    public static final String str ="/home/admin1/Documents/Programs/JavaPrograms/Stock.json";

    public static void addStock() throws JsonGenerationException, JsonMappingException, IOException {
        String string = OopsUtility.readFile(str);
        try {
            liOfStock = OopsUtility.userReadValue(string, Stock.class);
            System.out.println("File is not empty!");
            System.out.println("Adding data.....");
        } catch (Exception e) {
            System.out.println("File is empty!");
            System.out.println("Adding data.....");
        }
        stock = new Stock();
        System.out.println("Enter the stock name");
        stock.setStockNames(OopsUtility.readString());
        System.out.println("Enter total number of shares");
        stock.setNumberOfShare(OopsUtility.readInteger());
        System.out.println("Enter stock share price");
        stock.setSharePrice(OopsUtility.readdouble());
        liOfStock.add(stock);
        System.out.println("Stock added successfully!!!");
        String json = OopsUtility.userWriteValueAsString(liOfStock);
        OopsUtility.writeFile(json, str);
    }

    public static void displayStock() throws IOException {
        String string = OopsUtility.readFile(str);
        try {
            liOfStock = OopsUtility.userReadValue(string, Stock.class);
        } catch (Exception e) {
            System.out.println("File is empty!!! Nothing in data to display");
        }
        for (Stock stock : liOfStock) {
            System.out.println("Stock Name               : " + stock.getStockNames());
            System.out.println("Total number of Stock    : " + stock.getNumberOfShare());
            System.out.println("Share Price              : " + stock.getSharePrice());
            System.out.println("-------------------------------------------------------");
        }
    }

    public static void valueOfEachStock() throws IOException {
        String string = OopsUtility.readFile(str);
        try {
            liOfStock = OopsUtility.userReadValue(string, Stock.class);
        } catch (Exception e) {
            System.out.println("File is empty!!! Nothing in data to display");
        }
        for (Stock stock : liOfStock) {
            System.out.println("Stock Name               : " + stock.getStockNames());
            System.out.println("Value of this stock is   :" + stock.getNumberOfShare() * stock.getSharePrice());
            System.out.println("------------------------------------------------------");
        }
    }

    public static void totalStockValue() throws IOException {
        String string = OopsUtility.readFile(str);
        try {
            liOfStock = OopsUtility.userReadValue(string, Stock.class);
        } catch (Exception e) {
            System.out.println("File is empty!!! Nothing in data to display");
        }
        double sum = 0;
        for (Stock stock : liOfStock) {
            sum += (stock.getNumberOfShare() * stock.getSharePrice());
        }
        System.out.println("Total value of stock is :" + sum + "\n");

    }



	

		}
	


