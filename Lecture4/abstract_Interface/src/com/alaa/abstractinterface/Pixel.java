package com.alaa.abstractinterface;

public class Pixel extends Phone implements shareable{

	public Pixel(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
		super(versionNumber, batteryPercentage, carrier, ringtone);
		
	}
	
	
	@Override
	public void displayInfo() {
		System.out.println(String.format("Google Asistant says: \n Version Number: %s \n Battery Percentage: %d \n Carrier: %s \n Ringtone: %s \n",
				this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingtone()));
	}


	@Override
	public void takePicture() {
		System.out.println("Snap !!");
		
	}


	@Override
	public void turnOn() {
		System.out.println("On !!");
		
	}


	@Override
	public void scan() {
		System.out.println("Scanning ...");
		
	}


	@Override
	public void connect() {
		System.out.println("connected successfully !");
		
	}


	@Override
	public void send() {
		System.out.println("Sending ...");
		
	}


	@Override
	public void disconnect() {
		System.out.println("Disconnecting.");
		
	}


	

}
