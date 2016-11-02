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
			
			Patient p = new Patient(name, age, weight, diagnoses, new ArrayList<String>(), new ArrayList<Medication>(), doctorId);
			patients.add(p);
			doctors.get(doctorId).AddPatient(i); //adds patient to the doctor
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
	}
}
