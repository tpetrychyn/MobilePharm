package ense374ass3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Doctor> doctors = new ArrayList<>();
	static ArrayList<Patient> patients = new ArrayList<>();
	
	static void loadDoctors() throws IOException {
		Scanner in = new Scanner(Paths.get("Doctors.txt")).useDelimiter(",");
		
		for (int i=0;i<2;i++) {
			String name = in.next();
			
			Doctor d = new Doctor(name, new ArrayList<Integer>());
			doctors.add(d);
		}
	}
	
	static void loadPatients() throws IOException {
		Scanner in = new Scanner(Paths.get("Patients.txt")).useDelimiter(",");
		
		for (int i=0;i<2;i++) {
			String name = in.next();
			
			int age = in.nextInt();
			
			int weight = in.nextInt();
			
			String diagnoses = in.next();
			
			int doctorId = in.nextInt();
			
			Patient p = new Patient(name, age, weight, diagnoses, new ArrayList<Medication>(), new ArrayList<Medication>(), doctorId);
			patients.add(p);
			doctors.get(doctorId).AddPatient(i); //adds patient to the doctor
		}
	}
	
	static void loadMedications() throws IOException {
		Scanner in = new Scanner(Paths.get("Medications.txt")).useDelimiter(",");
		
		for (int i=0;i<4;i++) {
			int patientId = in.nextInt();
			
			System.out.println(patientId);
			
			String name = in.next();
			
			String type = in.next();
			
			String startDate = in.next();
			
			String endDate = in.next();
			
			System.out.println(startDate + " " + endDate);
			
			Medication m = new Medication();
			MedicationTaking mt = new MedicationTaking();
			m.medTaking = mt;
			m.name = name;
			m.type = type;
			m.medTaking.startDate = startDate;
			m.medTaking.endDate = endDate;
			patients.get(patientId).medicationList.add(m);
		}
	}

	public static void main(String[] args) {
		try {
			loadDoctors();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			loadPatients();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			loadMedications();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Doctor Dashboard - Enter your ID number:");
		int doctorId = -1;
		
		while (doctorId < 0) {
			
			doctorId = sc.nextInt();
			if (doctors.get(doctorId) == null) {
				System.out.println("Could not find that doctor ID Number");
				doctorId = -1;
			}
		}
		System.out.println("Welcome Dr. " + doctors.get(doctorId).name);
		
		System.out.println("Type F followed by a patients id followed by a medication type to search their records");
		String command = sc.next();
		System.out.println(command);
		if (command.compareTo("F") != 0) {
			System.out.println("Invalid command");
			return;
		}
		
		int patientId = sc.nextInt();
		String medicationType = sc.next();
		for (Medication m : patients.get(patientId).GetMedication()) {
			if (m.type.compareTo(medicationType) == 0)
				System.out.println(m.name + " " + m.type + " " + m.medTaking.startDate + " " + m.medTaking.endDate);
		}
	}
	
	static void printLine(String output) {
		System.out.println(output);
	}
}
