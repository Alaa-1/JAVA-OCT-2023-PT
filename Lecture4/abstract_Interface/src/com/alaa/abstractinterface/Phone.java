package com.alaa.abstractinterface;

public abstract class Phone {
	//MEMBER VARIABLES
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringtone;
	
	
	
	// CONSTRUCTOR
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringtone = ringtone;
	}
	
	// METHODS
	public void displayInfo() {
		
		System.out.println(String.format("Phone Info: \n Version Number: %s \n Battery Percentage: %d \n Carrier: %s \n Ringtone: %s \n",
				this.versionNumber, this.batteryPercentage, this.carrier, this.ringtone));
	}
	
	// abstract method
	public abstract void takePicture();
	
	
	// GETTERS & SETTERS
	public String getVersionNumber() {
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getRingtone() {
		return ringtone;
	}
	public void setRingtone(String ringtone) {
		this.ringtone = ringtone;
	}
	
	

}
