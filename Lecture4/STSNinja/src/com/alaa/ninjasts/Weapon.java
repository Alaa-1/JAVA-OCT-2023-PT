package com.alaa.ninjasts;

public class Weapon {
	// Member Varibales
	private String name;
	private Integer damage;
	
	// ALL ARGS CONSTRUCTOR
	public Weapon(String name, Integer damage) {
		super();
		this.name = name;
		this.damage = damage;
	}
	// GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDamage() {
		return damage;
	}
	public void setDamage(Integer damage) {
		this.damage = damage;
	}
	
	
}
