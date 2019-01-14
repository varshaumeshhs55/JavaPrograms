package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.OopsUtility;

public class Doctor {
private	int did;
private	String dname;
private	String avail;
private String spec;
	
	//getters and setters method
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getAvail() {
		return avail;
	}
	public void setAvail(String avail) {
		this.avail = avail;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	

public void addDoctor()
{
	Doctor doctor=new Doctor();
	System.out.println("Enter Your Details ...");

	System.out.println("Enter Name: ");
	doctor.setDname(OopsUtility.readString());
	System.out.println();

	System.out.println("Enter Id: ");
	doctor.setDid(OopsUtility.readInteger());
	System.out.println();

	System.out.println("Enter Specialization: ");
	doctor.setSpec(OopsUtility.readString());
	System.out.println();

	System.out.println("Enter Availability (1:AM   2:PM  3:Both) :");
	doctor.setAvail(OopsUtility.readString());
	System.out.println();
}

}