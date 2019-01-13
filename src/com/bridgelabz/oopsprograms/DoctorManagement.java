package com.bridgelabz.oopsprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class DoctorManagement {
 static List<Doctor>  doc=new ArrayList<Doctor>();
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

public ArrayList<Doctor> FindById ( ArrayList<Doctor> al,int did)  //search doctor by id
{  
	ArrayList<Doctor> temp=new ArrayList<Doctor>();
	
	for(Doctor d:doc)
	{
		if(d.getDid()==did)
		{
			temp.add(d);
		}
	}
	return temp;	
}

public ArrayList<Doctor> FindByName (ArrayList<Doctor> al, String dn)   //search doctor by name
{ 
	ArrayList<Doctor> temp=new ArrayList<Doctor>();
	
	for(Doctor d:doc)
	{
		if(d.getDname()==dn)
		{
			temp.add(d);
		}
	}
	return temp;
}

public ArrayList<Doctor> FindByava (ArrayList<Doctor> al, String as)  //search doctor by availability
{
	ArrayList<Doctor> temp=new ArrayList<Doctor>();
	
	for(Doctor d:doc)
	{
		if(d.getAvail()==as)
		{
			temp.add(d);
		}
	}
		return temp;	
}
}
//public ArrayList<Patients> FindById1 (ArrayList<Patients> al1, int fdid1)  //search patients by id
//{
//	ArrayList<Patients> temp=new ArrayList<Patients>();
//
//	for(Patients p1:al1)
//	{
//		if(p1.getPid()==fdid1)
//		{
//			temp.add(p1);
//		}
//	}
//	return temp;
//}
//
//public ArrayList<Patients> FindByName1 (ArrayList<Patients> al1, String dn1)  //search patients by name
//{
//	ArrayList<Patients> temp=new ArrayList<Patients>();
//	
//	for(Patients p1:al1)
//	{
//		if(p1.getPname()==dn1)
//		{
//			temp.add(p1);
//		}
//	}
//	return temp;
//}
//
//public ArrayList<Patients> FindByava1 (ArrayList<Patients> al1, String as1)   //search patients by availability
//{	
//	ArrayList<Patients> temp=new ArrayList<Patients>();
//	
//	for(Patients p1:al1)
//	{
//		if(p1.getMobno()==as1)
//		{
//			temp.add(p1);
//		}
//	}
//	return temp;
//}
//}
//
