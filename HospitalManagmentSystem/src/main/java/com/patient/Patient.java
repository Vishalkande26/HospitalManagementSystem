package com.patient;

public class Patient {
	private String patientId;
	private String patientName;
	private String patientDisease;
	private String patientAddress;
	private String patientPhone;
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}
	public String getPatientrAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public Patient(String patientId, String patientName,String patientDisease, String patientAddress, String patientPhone) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientDisease = patientDisease;
		this.patientAddress = patientAddress;
		this.patientPhone = patientPhone;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}


}
