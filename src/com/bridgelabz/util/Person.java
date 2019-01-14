package com.bridgelabz.util;


	public class Person {
	    private String firstName;
	    private String lastName;
	    private long phNumber;
	    private Address address = new Address();

	    public Person() {
	        firstName = null;
	        lastName = null;
	        phNumber = 0;
	        address = null;
	    }

	    public String getfName() {
	        return firstName;
	    }

	    public void setfName(String fName) {
	        this.firstName = fName;
	    }

	    public String getlName() {
	        return lastName;
	    }

	    public void setlName(String lName) {
	        this.lastName = lName;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    public long getPhNumber() {
	        return phNumber;
	    }

	    public void setPhNumber(long phNumber) {
	        this.phNumber = phNumber;
	    }

	}


		


