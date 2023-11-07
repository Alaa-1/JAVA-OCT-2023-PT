package com.alaa.ninjasts;

public class TestNinja {

	public static void main(String[] args) {
		
		// INSTANCES WEAPON CLASS
		Weapon donatelloWeapon = new Weapon("Bo Staff", 85);
		Weapon alfredo = new Weapon("Alfredo", 130);
		
		// INSTANTIATE NINJA CLASS
		Ninja donatello = new Ninja("Donatello", 230, 35, donatelloWeapon);
		// INSTANTIATE SUPERNINJA CLASS
		SuperNinja splinter = new SuperNinja("splinter", 100, 150, alfredo, true, 3, "Unknown");
		// TEST Methods
		splinter.displayStats();
		splinter.attack(donatello);
		
	
	}

}
