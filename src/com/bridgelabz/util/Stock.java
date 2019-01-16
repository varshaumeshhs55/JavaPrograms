package com.bridgelabz.util;

public class Stock {

private String StockNames;
private int NumberOfShare;
private	double SharePrice; 

public Stock()
{
	StockNames=null;
	NumberOfShare=0;
	SharePrice=0.0;
}

public String getStockNames() {
	return StockNames;
}

public void setStockNames(String stockNames) {
	StockNames = stockNames;
}

public int getNumberOfShare() {
	return NumberOfShare;
}

public void setNumberOfShare(int numberOfShare) {
	NumberOfShare = numberOfShare;
}

public double getSharePrice() {
	return SharePrice;
}

public void setSharePrice(double sharePrice) {
	SharePrice = sharePrice;
}}

