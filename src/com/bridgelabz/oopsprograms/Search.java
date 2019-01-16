 package com.bridgelabz.oopsprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class Search {

	    public static List<Doctor> searchByName() throws IOException {
	        String string = OopsUtility.readFile( ClinicManagement.doctorFile);
	        try {
	        	 ClinicManagement.listofdoctors  = OopsUtility.userReadValue(string, Doctor.class);
	            List<Doctor> list = new ArrayList<>();
	            System.out.println("Enter the doctor's name to be searched");
	            String name = OopsUtility.readString();
	            System.out.println(name);
	            for (Doctor doctor : ClinicManagement.listofdoctors ) {
	                if (name.equals(doctor.getDname())) {
	                    list.add(doctor);
	                }
	            }
	            return list;
	        } catch (Exception e) {
	            System.out.println("File is empty!");
	            return null;
	        }

	    }

	    public static List<Doctor> searchById() throws IOException {
	        String string = OopsUtility.readFile( ClinicManagement.doctorFile);
	        try {
	        	 ClinicManagement.listofdoctors  = OopsUtility.userReadValue(string, Doctor.class);
	            List<Doctor> list = new ArrayList<>();
	            System.out.println("Enter the doctor's id to be searched");
	            int id = OopsUtility.readInteger();
	            for (Doctor doctor :  ClinicManagement.listofdoctors ) {
	                if (id == doctor.getDid()) {
	                    list.add(doctor);

	                }
	            }
	            return list;
	        } catch (Exception e) {
	            System.out.println("File is empty! Doctor cannot be searched");
	            return null;
	        }

	    }

	    public static List<Doctor> searchBySpecialization() throws IOException {
	        String string = OopsUtility.readFile(ClinicManagement.doctorFile);
	        try {
	        	 ClinicManagement.listofdoctors  = OopsUtility.userReadValue(string, Doctor.class);
	  
	        	 List<Doctor> list = new ArrayList<>();
	            System.out.println("Enter the doctor's name to be searched");
	            String specialization = OopsUtility.readString();
	            for (Doctor doctor :  ClinicManagement.listofdoctors ) {
	                if (specialization.equals(doctor.getSpec())) {
	                    list.add(doctor);
	                }
	            }
	           
	            return ClinicManagement.listofdoctors;
	           
	        } catch (Exception e) {
	            System.out.println("File is empty! Doctor cannot be searched");
	            return null;
	        }
	       
	    }

	    public static List<Doctor> searchByAvailability() throws IOException {
	        String string = OopsUtility.readFile( ClinicManagement.doctorFile);
	        try {
	        	 ClinicManagement.listofdoctors = OopsUtility.userReadValue(string, Doctor.class);
	            List<Doctor> list = new ArrayList<>();
	            System.out.println("Enter when you need the doctor (eg: am/pm)");
	            String availability = OopsUtility.readString();
	            for (Doctor doctor :  ClinicManagement.listofdoctors ) {
	                if (availability.equals(doctor.getAvail())) {
	                    list.add(doctor);
	                }
	            }
	            return ClinicManagement.listofdoctors;
	        } catch (Exception e) {
	            System.out.println("File is empty! Doctor cannot be searched");
	            return null;
	        }

	    }

	    public static Patients searchByPatientId() throws IOException {
	        String string = OopsUtility.readFile(ClinicManagement.patientFile);
	        ClinicManagement.listofpatients = OopsUtility.userReadValue(string, Patients.class);
	        System.out.println("Enter the patient's id to be searched");
	        int id = OopsUtility.readInteger();
	        for (Patients patient :  ClinicManagement.listofpatients) {
	            if (id == patient.getPid()) {
	                return patient;
	            }
	        }
	        return null;
	    }

	    public static Patients searchByPhoneNo() throws IOException {
	        String string = OopsUtility.readFile(ClinicManagement.patientFile);
	        ClinicManagement.listofpatients = OopsUtility.userReadValue(string, Patients.class);
	        System.out.println("Enter the patient's phone number to search");
	        String phoneNo = OopsUtility.readString();

	        for (Patients patient : ClinicManagement.listofpatients) {
	            if (phoneNo.equals(patient.getMobno())) {
	                return patient;
	            }
	        }
	        return null;
	    }
	}


		
