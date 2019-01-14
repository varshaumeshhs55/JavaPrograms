package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.OopsUtility;

public class Patients {
	private int pid;
	private String pname;
	private int age;
	private String mobno;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	

public void addPatient() {
	Patients patients = new Patients();
	System.out.println("Enter Your Details ...");

	System.out.println("Enter Name: ");
	patients.setPname(OopsUtility.readString());
	System.out.println();

	System.out.println("Enter Id: ");
	patients.setPid(OopsUtility.readInteger());
	System.out.println();

	System.out.println("Enter Age: ");
	patients.setAge(OopsUtility.readInteger());
	System.out.println();

	System.out.println("Enter Mobile Number: ");
	patients.setMobno(OopsUtility.readString());
	System.out.println();
}}
