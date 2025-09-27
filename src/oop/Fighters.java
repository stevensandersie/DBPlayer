package oop;

import com.sun.tools.javac.Main;

public class Fighters extends Player {

	private String weapon;
	private int physDamage;

	public Fighters(String playerId, String name, String type, int health, int baseDamage, String weapon,
			int physDamage) {
		super(playerId, name, type, health, baseDamage);
		this.weapon = weapon;
		this.physDamage = physDamage;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getPhysDamage() {
		return physDamage;
	}

	public void setPhysDamage(int physDamage) {
		this.physDamage = physDamage;
	}

	@Override
	public void displayData() {
		System.out.println("Player ID: " + getPlayerId());
		System.out.println("Hello my name is " + getName());
		System.out.println("Type: " + getType());
		System.out.println("Base Health: " + getHealth());
		System.out.println("Base Damage: " + getBaseDamage());
		System.out.println("Weapon: " + getWeapon());
		System.out.println("Physical Damage: " + getPhysDamage());
	
		new Main();
	}
	
}
