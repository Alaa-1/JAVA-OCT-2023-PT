package com.alaa.ninjasts;

public class Ninja {
	// MEMBER VARIABLES
	private String name;
	private int health;
	private int power;
	private Weapon weapon;

//	 EMPTY CONSTRUCTOR - zero-args
//	public Ninja() {
//		this.name = "Anonymous";
//		this.health = 80;
//		this.power = 30;
//	}

	// ALL ARGS CONSTRUCTOR (OVERLOADING CONSTUCTOR)
	public Ninja(String name, int health, int power, Weapon weapon) {
		this.name = name;
		this.health = health;
		this.power = power;
		this.weapon = weapon;
	}

	// METHODS
	public void displayStats() {
		System.out.println("Name: " + this.getName());
		System.out.println("Health:" + this.getHealth());
	}

	public void attack(Ninja target) {
		System.out.println("=== Ninja Attack ===");
		target.setHealth(target.getHealth() - this.weapon.getDamage());

		System.out.println(this.getName() + " attacks " + target.getName() + " with " + this.weapon.getName() + " for "
				+ this.getPower() + ", and now... \n" + target.getName() + " has " + target.getHealth() + " hp left");
	}

	public void eatStrawberry() {
		// this.health += 10;
		this.setHealth(this.getHealth() + 10);
	}

	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
