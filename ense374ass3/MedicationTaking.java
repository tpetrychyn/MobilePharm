package ense374ass3;

import java.util.Date;

public class MedicationTaking {
	Date startDate;
	Date endDate;
	int dosage;
	int dailyFrequency;
	
	public Date GetStartDate() {
		return startDate;
	}
	
	public Date GetEndDate() {
		return endDate;
	}
	
	public int GetDosage() {
		return dosage;
	}
	
	public int GetDailyFrequency() {
		return dailyFrequency;
	}

	public void SetStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void SetEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void SetDosage(int dosage) {
		this.dosage = dosage;
	}

	public void SetDailyFrequency(int dailyFrequency) {
		this.dailyFrequency = dailyFrequency;
	}
}
