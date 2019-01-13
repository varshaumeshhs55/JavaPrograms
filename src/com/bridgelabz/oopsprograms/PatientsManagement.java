package com.bridgelabz.oopsprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class PatientsManagement {
	// method to add patients information
	static List<Patients> pat = new ArrayList<Patients>();

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
	}

	public ArrayList<Patients> FindById1(ArrayList<Patients> al1, int fdid1) // search patients by id
	{
		ArrayList<Patients> temp = new ArrayList<Patients>();

		for (Patients p1 : al1) {
			if (p1.getPid() == fdid1) {
				temp.add(p1);
			}
		}
		return temp;
	}

	public ArrayList<Patients> FindByName1(ArrayList<Patients> al1, String dn1) // search patients by name
	{
		ArrayList<Patients> temp = new ArrayList<Patients>();

		for (Patients p1 : al1) {
			if (p1.getPname() == dn1) {
				temp.add(p1);
			}
		}
		return temp;
	}

	public ArrayList<Patients> FindByava1(ArrayList<Patients> al1, String as1) // search patients by availability
	{
		ArrayList<Patients> temp = new ArrayList<Patients>();

		for (Patients p1 : al1) {
			if (p1.getMobno() == as1) {
				temp.add(p1);
			}
		}
		return temp;
	}
}
