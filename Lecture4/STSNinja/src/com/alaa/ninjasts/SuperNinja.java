package com.alaa.ninjasts;

public class SuperNinja extends Ninja {

	// MEMBER VARIABLES
	private Boolean isInvisible;
	private int damageMultiplier;
	private String typeOfMartialArts;
	
	
	
	// CONSTRUCTOR
	public SuperNinja(String name, int health, int power, Weapon weapon, Boolean isInvisible, int damageMultiplier,
			String typeOfMartialArts) {
		super(name, health, power, weapon);
		this.isInvisible = isInvisible;
		this.damageMultiplier = damageMultiplier;
		this.typeOfMartialArts = typeOfMartialArts;

	}
	
//	 Methods
	@Override
	public void attack(Ninja target) {
		System.out.println("=== SuperNinja Attack ===");
		target.setHealth(target.getHealth() - (this.getWeapon().getDamage()* this.damageMultiplier));

		System.out.println(this.getName() + " attacks " + target.getName() + " with " + this.getWeapon().getName() + " for "
				+ this.getWeapon().getDamage()*this.damageMultiplier + " DP" + ", and now... \n" + target.getName() + " has " + target.getHealth() + " hp left");
	}
	
	
	// GETTERS & SETTERS
	public Boolean getIsInvisible() {
		return isInvisible;
	}
	public void setIsInvisible(Boolean isInvisible) {
		this.isInvisible = isInvisible;
	}
	public int getDamageMultiplier() {
		return damageMultiplier;
	}
	public void setDamageMultiplier(int damageMultiplier) {
		this.damageMultiplier = damageMultiplier;
	}
	public String getTypeOfMartialArts() {
		return typeOfMartialArts;
	}
	public void setTypeOfMartialArts(String typeOfMartialArts) {
		this.typeOfMartialArts = typeOfMartialArts;
	}
	
	
	
}
