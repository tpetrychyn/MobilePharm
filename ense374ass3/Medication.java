package ense374ass3;

import java.util.Date;

public class Medication {
	int refills;
	String name;
	int number;
	String type;
	Doctor prescriber;
	MedicationTaking medTaking;
	
	public Medication(int refills, String name, int number, Doctor prescriber, MedicationTaking medTaking) {
		this.refills = refills;
		this.name = name;
		this.number = number;
		this.prescriber = prescriber;
		this.medTaking = medTaking;
	}
	
	public Medication() {
		
	}

	public int GetRefills() {
		return refills;
	}
	
	public String GetName() {
		return name;
	}
	
	public int GetNumber() {
		return number;
	}
	
	public Doctor GetPrescriber() {
		return prescriber;
	}
	
	public MedicationTaking GetMedTaking() {
		return medTaking;
	}
	
	public void SetMedTaking(String startDate, String endDate, int dosage, int dailyFrequency) {
		medTaking.startDate = startDate;
		medTaking.endDate = endDate;
		medTaking.dosage = dosage;
		medTaking.dailyFrequency = dailyFrequency;
	}
}
