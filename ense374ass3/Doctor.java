package ense374ass3;

import java.util.ArrayList;

public class Doctor {
	String name;
	ArrayList<Integer> patientIds = new ArrayList<>();
	
	public Doctor() {
	}
	
	public Doctor(String name, ArrayList<Integer> patientIds) {
		this.name = name;
		this.patientIds = patientIds;
	}

	public String GetName() {
		return name;
	}
	
	public ArrayList<Integer> GetPatientIds() {
		return patientIds;
	}
	
	public void AddPatient(int pId) {
		patientIds.add(pId);
	}
	
	ArrayList<Medication> GetPatientHistory(Patient p) {
		return p.GetHistory();
	}
	
	ArrayList<Medication> GetPatientMedications(Patient p) {
		return p.GetMedication();
	}
}
