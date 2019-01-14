package com.bridgelabz.util;

public class Address {
	
	    private String street;
	    private String city;
	    private String state;
	    private long zipCode;
	    public Address()
	    {
	        street=null;
	        city=null;
	        state=null;
	        zipCode=0;
	    }
	    public String getStreet() {
	        return street;
	    }
	    public void setStreet(String street) {
	        this.street = street;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public long getZipCode() {
	        return zipCode;
	    }
	    public void setZipCode(long zipCode) {
	        this.zipCode = zipCode;
	    }
	}


		

