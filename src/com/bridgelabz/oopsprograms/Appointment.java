package com.bridgelabz.oopsprograms;

import java.util.ArrayList;
import java.util.List;

public class Appointment {
	
	private String docName;
	List<Patients> liOfPatients=new ArrayList<Patients>();
	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	
	public List<Patients> getListOfPatients() {
		return liOfPatients;
	}
	
	public void setListOfPatients(List<Patients> lop) {
		this.liOfPatients = lop;
	}
	


}

	

	
	
	