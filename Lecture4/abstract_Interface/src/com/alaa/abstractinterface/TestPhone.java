package com.alaa.abstractinterface;

public class TestPhone {

	public static void main(String[] args) {

		// Instance of Phone
//		Phone iPhone = new Phone("iOS17", 100, "Orange", "riiiiing");
//
//		iPhone.displayInfo();

		// instances from IPhone
		Iphone iphone15ProMax = new Iphone("iOS17", 95, "Telecom", "goodmorning.mp3");
		iphone15ProMax.displayInfo();

		// instances from Pixel
		Pixel pixel7 = new Pixel("Android14", 80, "Ooredoo", "silent");
		pixel7.displayInfo();
		
		
		pixel7.takePicture();

	}

}
