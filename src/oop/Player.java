package oop;

public abstract class Player {
	private String playerId, name, type;
	private int health, baseDamage;

	public Player(String playerId, String name, String type, int health, int baseDamage) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.type = type;
		this.health = health;
		this.baseDamage = baseDamage;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public abstract void displayData();

}
