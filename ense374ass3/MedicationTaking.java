package ense374ass3;

import java.util.Date;

public class MedicationTaking {
	String startDate;
	String endDate;
	int dosage;
	int dailyFrequency;
	
	public String GetStartDate() {
		return startDate;
	}
	
	public String GetEndDate() {
		return endDate;
	}
	
	public int GetDosage() {
		return dosage;
	}
	
	public int GetDailyFrequency() {
		return dailyFrequency;
	}

	public void SetStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void SetEndDate(String endDate) {
		this.endDate = endDate;
	}

	public void SetDosage(int dosage) {
		this.dosage = dosage;
	}

	public void SetDailyFrequency(int dailyFrequency) {
		this.dailyFrequency = dailyFrequency;
	}
}
