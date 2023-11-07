package com.alaa.abstractinterface;

public class Iphone extends Phone{

	// CONSTRUCTOR
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
		super(versionNumber, batteryPercentage, carrier, ringtone);
	}
	
	@Override
	public void displayInfo() {
		System.out.println(String.format("Siri says: \n Version Number: %s \n Battery Percentage: %d \n Carrier: %s \n Ringtone: %s \n",
				this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingtone()));
	}

	@Override
	public void takePicture() {
		System.out.println("Taking a picture !!");
		
	}

}
