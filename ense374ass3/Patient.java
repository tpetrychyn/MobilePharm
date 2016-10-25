package ense374ass3;

import java.util.ArrayList;

public class Patient {
	String name;
	int age;
	int weight;
	String diagnosis;
	ArrayList<String> history = new ArrayList<>();
	ArrayList<Medication> medicationList = new ArrayList<>();
	Doctor doctor;
	
	public Patient(String name, int age, int weight, String diagnoses, ArrayList<String> history, ArrayList<Medication> medicationList, Doctor doctor) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.diagnosis = diagnoses;
		this.history = history;
		this.medicationList = medicationList;
		this.doctor = doctor;
	}
	
	public ArrayList<Medication> GetMedication() {
		return medicationList;
	}
	
	public ArrayList<String> GetHistory() {
		return history;
	}
	
	public void AddMedication(Medication m) {
		medicationList.add(m);
	}
	
	public void AddHistory(String h) {
		history.add(h);
	}
}
