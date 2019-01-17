package com.bridgelabz.oopsprograms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.Stock;

public class ClinicManagement {

	static List<Doctor> listofdoctors = new ArrayList<Doctor>();
	static List<Patients> listofpatients = new ArrayList<Patients>();
	static List<Appointment> listofappointments = new ArrayList<Appointment>();
	static String doctorFile = "/home/admin1/Documents/Programs/doctor.json";
	static String patientFile = "/home/admin1/Documents/Programs/patient.json";
	static String AppointmentFile = "/home/admin1/Documents/Programs/Appointment.json";
	static Patients patients =null; 
	public static void main(String[] args) throws IOException {

		int c = 0;
		{

			do {
				System.out.println();
				System.out.println("----------Clinique Management System---------");
				System.out.println();
				System.out.println("1.Add Doctor");
				System.out.println("2.Add Patients");
				System.out.println("3.Print Doctor");
				System.out.println("4.Print Patients");
				System.out.println("5.Search Doctor by Name ,Id or Availability");
				System.out.println("6.Search Patients by Id or Mobile Number");
				System.out.println("7.Take Appointment");
				System.out.println("8.Exit");
				System.out.println();
				System.out.println("Enter your Choice: ");
				int choice = OopsUtility.readInteger();
				switch (choice) {

				case 1:
					try {
						addDoctor();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:
					try {
						addPatient();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 3:System.out.println("All Doctors Details..");
					displayDoctor();
					
					// Printing All Doctors Details..
					
					
					System.out.println(listofdoctors);
					break;
				case 4:
					// Printing Patients Details..
					System.out.println("All Patients Details..");
					displayPatients();
					System.out.println(listofpatients);
					break;
				case 5:
					int ch1 = 0;
					do {
						// search
						System.out.println();
						System.out.println("----------Search Doctor---------");
						System.out.println();
						System.out.println("1.Search Docotor By id");
						System.out.println("2.Search Docotor By Name");
						System.out.println("3.Search Docotor By Specialization");
						System.out.println("4.Search Docotor By Availability");
						System.out.println("5.exit");
						System.out.println("Enter your Choice: ");
						int ch = OopsUtility.readInteger();

						switch (ch) {
						case 1:
							System.out.println("Searching by id");
							List<Doctor> doctor1 = null;
							try {
								doctor1 = Search.searchById();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (!doctor1.isEmpty())
								System.out.println("Doctor is present");
							else
								System.out.println("Doctor is not present");
							break;
						case 2:
							System.out.println("Searching by name");
							List<Doctor> doctor2 = null;
							try {
								doctor2 = Search.searchByName();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (!doctor2.isEmpty())
								System.out.println("Doctor is present");
							else
								System.out.println("Doctor is not present");
							break;
						case 3:
							List<Doctor> doctor3 = null;
							try {
								doctor3 = Search.searchBySpecialization();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (!doctor3.isEmpty())
								System.out.println("Doctor is present");
							else
								System.out.println("Doctor is not present");
							break;
						case 4:
							List<Doctor> doctor4 = null;
							try {
								doctor4 = Search.searchByAvailability();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (!doctor4.isEmpty())
								System.out.println("Doctor is present");
							else
								System.out.println("Doctor is not present");
							break;
						case 5:
							System.exit(0);
						default:
							System.out.println("Please select correct choice");
							break;

						}
					}

					while (ch1 < 5);
				case 6:
					Search f1 = new Search();
					int ch2 = 0;
					do {
						System.out.println();
						System.out.println("----------Search Patients---------");
						System.out.println();
						System.out.println("1.Search Patients By Id");

						System.out.println("2.Search Patients By Mobile Number");
						System.out.println("3.Exit");
						System.out.println();
						System.out.println("Enter your Choice: ");
						int ch3 = OopsUtility.readInteger();
						switch (ch3) {
						case 1:
							System.out.println("Searching by id");
							Patients patient1 = null;
							try {
								patient1 = Search.searchByPatientId();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (patient1 != null)
								System.out.println("Patient is present");
							else
								System.out.println("Patient is not present");
							break;
						case 2:
							System.out.println("Searching by Phone Number");
							Patients patient2 = null;
							try {
								patient2 = Search.searchByPhoneNo();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if (patient2 != null)
								System.out.println("Patient is present");
							else
								System.out.println("Patient is not present");
							break;

						case 3:
							System.exit(0);
						default:
							System.out.println("Invalid choice");
							break;
						}
					} while (ch2 < 5);break;

				case 7:takeAppointment(); break;
				case 8:
					System.exit(0);				
					default:System.out.println("Invalid choice");
					break;
				}
			} while (c < 10);
		}
	}
	

	

	public static void addDoctor() throws IOException {

		String string = OopsUtility.readFile(doctorFile);
		try {
			listofdoctors = OopsUtility.userReadValue(string, Doctor.class);
			System.out.println("File is not empty!");

		} catch (Exception e) {
			System.out.println("File is empty!");

		}
		Doctor doctor = new Doctor();
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
		listofdoctors.add(doctor);
		System.out.println("Doctor added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(listofdoctors);
		OopsUtility.writeFile(json, doctorFile);
	}

	public static void addPatient() throws IOException {
		
		patients=new Patients();
	
		String string = OopsUtility.readFile(patientFile);
		try {
			listofpatients = OopsUtility.userReadValue(string, Patients.class);
			System.out.println("File is not empty!");

		} catch (Exception e) {
			System.out.println("File is empty!");

		}
		
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
		listofpatients.add(patients);
		System.out.println("patients added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(listofpatients);
		OopsUtility.writeFile(json, patientFile);
	}
	
	
	public static void takeAppointment() throws IOException {
		String string = OopsUtility.readFile(AppointmentFile);
		try {
			listofappointments = OopsUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patients patient = Search.searchByPhoneNo();
		if (patient != null) 
		{
			System.out.println("Patient data already exist!!\nTaking appointment now....");
			appoint(patient);
			String json = OopsUtility.userWriteValueAsString(listofappointments);
			OopsUtility.writeFile(json, AppointmentFile);
		} else {
			System.out.println("Patient data doesnot exist\nPlease first add patient detials on to database");
		}
	}

	public static void displayList(List<Doctor> docList) {
		for (Doctor doctor : docList) 
		{
			System.out.println("Doctor's ID: " + doctor.getDid());
			System.out.println("Doctor's name: " + doctor.getDname());
			System.out.println("Doctor's specialization: " + doctor.getSpec());
			System.out.println("Doctor's availability: " + doctor.getAvail());
			System.out.println("---------------------------------------------");
		}
	}
	public static void displayList1(List<Patients> patList) {
		for (Patients patient : patList) 
		{
			System.out.println("Patient's ID: " + patient .getPid());
			System.out.println("Patient's name: " +patient .getPname());
			System.out.println("Patient's mobno: " +patient .getMobno());
			System.out.println("Patient's age: " + patient .getAge());
			System.out.println("---------------------------------------------");
		}
	}

	public static void searchDoc(List<Doctor> doctorList, Patients patient) {
		System.out.println("Enter id");
		int id = OopsUtility.readInteger();
		
		 
		try {
			//System.out.println(doctorList);
			for (Doctor doctor : doctorList) {
				if (id == doctor.getDid()) {
					for (Appointment appointment : listofappointments) {
						if (doctor.getDname().equals(appointment.getDocName())) {
							List<Patients> patientAppointmentList = appointment.getListOfPatients();
							if (patientAppointmentList.size() < 5) {
								patientAppointmentList.add(patient);
								appointment.setListOfPatients(patientAppointmentList);
								System.out.println("Appointment is set");
								break;
							} else {
								System.out.println(
										"Appointment is full !!! Please wait for the next schedule or Select different doctor");

							}
						
						
						} else {
							Appointment newAppointment = new Appointment();
							newAppointment.setDocName(doctor.getDname());
							List<Patients> newPatientAppointmentList = new ArrayList<>();
							newPatientAppointmentList.add(patient);
							newAppointment.setListOfPatients(newPatientAppointmentList);
							listofappointments.add(newAppointment);
							System.out.println("Appointment is set");

						}
					}
					if (listofappointments.size() == 0) {
						Appointment appointment2 = new Appointment();
						List<Patients> patientList1 = new ArrayList<Patients>();
						patientList1.add(patient);
						appointment2.setDocName(doctor.getDname());
						appointment2.setListOfPatients(patientList1);
						listofappointments.add(appointment2);
						System.out.println("Appointment is set");
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}}

public static void appoint(Patients patient) throws IOException {

	System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
	int choice = OopsUtility.readInteger();
	switch (choice) {
	case 1:
		List<Doctor> doctorList = Search.searchByName();
		displayList(doctorList);
		searchDoc(doctorList, patient);
		break;
	case 2:
		List<Doctor> doctorList1 = Search.searchBySpecialization();
		displayList(doctorList1);
		searchDoc(doctorList1, patient);
		break;
	case 3:
		List<Doctor> doctorList2 = Search.searchByAvailability();
		displayList(doctorList2);
		searchDoc(doctorList2, patient);
		break;
	}
}
public static void displayDoctor() throws IOException {
	String string = OopsUtility.readFile(doctorFile);
	try {
		listofdoctors = OopsUtility.userReadValue(string, Doctor.class);
		System.out.println("File is not empty");

	} catch (Exception e) {
		System.out.println("File is empty");
	}displayList(listofdoctors);
	
}

public static void displayPatients() throws IOException {
	String string = OopsUtility.readFile(patientFile);
	try {
		listofpatients = OopsUtility.userReadValue(string, Patients.class);
		System.out.println("File is not empty");

	} catch (Exception e) {
		System.out.println("File is empty");
	}displayList1(listofpatients);
	
}}
