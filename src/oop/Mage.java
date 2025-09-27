package oop;

public class Mage extends Player {

	private String magicType;
	private int magicDamage;

	public Mage(String playerId, String name, String type, int health, int baseDamage, String magicType,
			int magicDamage) {
		super(playerId, name, type, health, baseDamage);
		this.magicType = magicType;
		this.magicDamage = magicDamage;
	}

	public String getMagicType() {
		return magicType;
	}

	public void setMagicType(String magicType) {
		this.magicType = magicType;
	}

	public int getMagicDamage() {
		return magicDamage;
	}

	public void setMagicDamage(int magicDamage) {
		this.magicDamage = magicDamage;
	}

	@Override
	public void displayData() {
		System.out.println("Player ID: " + getPlayerId());
		System.out.println("Hello my name is " + getName());
		System.out.println("Type: " + getType());
		System.out.println("Base Health: " + getHealth());
		System.out.println("Base Damage: " + getBaseDamage());
		System.out.println("Magic Type: " + getMagicType());
		System.out.println("Magic Damage: " + getMagicDamage());

	}

}
