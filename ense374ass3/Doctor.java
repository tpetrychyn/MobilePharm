package ense374ass3;

import java.util.ArrayList;

public class Doctor {
	String name;
	ArrayList<Patient> patients = new ArrayList<>();
	
	public Doctor(String name, ArrayList<Patient> patients) {
		this.name = name;
		this.patients = patients;
	}

	public String GetName() {
		return name;
	}
	
	public ArrayList<Patient> GetPatients() {
		return patients;
	}
	
	public void AddPatient(Patient p) {
		patients.add(p);
	}
	
	ArrayList<String> GetPatientHistory(Patient p) {
		return p.GetHistory();
	}
	
	ArrayList<Medication> GetPatientMedications(Patient p) {
		return p.GetMedication();
	}
}
