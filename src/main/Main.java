package main;

import java.util.Scanner;
import java.util.Vector;

import oop.Fighters;
import oop.Mage;
import oop.Player;

public class Main {
	Scanner scan = new Scanner(System.in);
	Vector<Player> playerList = new Vector<>();
	private Integer idCounter = 001;

	public void Menu() {
		int menu;
		do {
			System.out.println("Epic Battle Arena");
			System.out.println("=================");
			System.out.println("1. Add new player");
			System.out.println("2. View player");
			System.out.println("3. Delete player");
			System.out.println("4. Exit");
			menu = scan.nextInt();
			scan.nextLine();

			switch (menu) {
			case 1:
				addplayer();
				break;

			case 2:
				viewplayer();
				break;

			case 3:
				removePlayer();
				break;

			default:
				break;
			}
		} while (menu != 4);
	}


	private void viewplayer() {
		if (playerList.isEmpty()) {
			System.out.println("No players available.");

		} else {
			System.out.println("View");
			System.out.println("================");
			for (Player player : playerList) {
				if (player instanceof Fighters) {
					player.displayData();
					System.out.println("");
				}
				if (player instanceof Mage) {
					player.displayData();
					System.out.println("");
				}
			}
		}
	}

	private void removePlayer() {
		
		if (playerList.isEmpty()) {
			System.out.println("No players available.");
			
		} else {
			String playerId = null;
			boolean playerFound = false;
			System.out.println("View");
			System.out.println("================");
			for (Player player : playerList) {
				if (player instanceof Fighters) {
					player.displayData();
					System.out.println("");
				}
				if (player instanceof Mage) {
					player.displayData();
					System.out.println("");
				}
				do {
					System.out.println("Enter player id");
					playerId = scan.nextLine();
					if (player.getPlayerId().equals(playerId)) {
						System.out.println("Player with ID" + playerId + "has been deleted");
						playerList.remove(player);
						playerFound = true;
					}

				System.out.println("Successfully Deleted game!");
				System.out.print("Press Enter to Continue...");
				scan.nextLine();
				return;
				} while (!playerFound);
			}
		}	
	}

	private void addplayer() {
		String name, type;
		int health, baseDamage;

		do {
			System.out.println("Player Name [8-20 char]: ");
			name = scan.nextLine();
		} while (name.length() < 8 || name.length() > 20);

		do {
			System.out.println("Player Health [100-1000]: ");
			health = scan.nextInt();
			scan.nextLine();
		} while (health < 100 || health > 1000);

		do {
			System.out.println("Player Base Damage [min 500]: ");
			baseDamage = scan.nextInt();
			scan.nextLine();
		} while (baseDamage > 500);

		do {
			System.out.println("Player Type [Fighter / Mage]: ");
			type = scan.nextLine();
		} while (!(type.equals("Fighter") || type.equals("Mage")));

		if (type.equals("Fighter")) {
			String weapon;
			int physDamage;
			do {
				System.out.println("Choose a Weapon [sword/axe]: ");
				weapon = scan.nextLine();
			} while (!(weapon.equals("sword") || weapon.equals("axe")));

			do {
				System.out.println("Enter physical damage [min 500]");
				physDamage = scan.nextInt();
				scan.nextLine();
			} while (physDamage > 500);

			if (weapon.equals("sword")) {
				physDamage = physDamage * 1000;
			} else if (weapon.equals("axe")) {
				physDamage = physDamage * 1000;
			}
			
			System.out.println("Fighter added successfully!");

			String playerId = String.format("F%03d", idCounter++);
			Fighters fighters = new Fighters(playerId, name, type, health, baseDamage, weapon, physDamage);
			playerList.add(fighters);

		} else if (type.equals("Mage")) {
			String magicType;
			int magicDamage;

			do {
				System.out.println("Magic Type [fire/ice]: ");
				magicType = scan.nextLine();
			} while (!(magicType.equals("fire") || magicType.equals("ice")));
			
			do {
				System.out.println("Magic damage value [min 500]: ");
				magicDamage = scan.nextInt();
				scan.nextLine();
			} while (magicDamage > 500);
			
			if (magicType.equals("fire")) {
				magicDamage = magicDamage * 1500;
			} else if (magicType.equals("ice")) {
				magicDamage = magicDamage * 1300;
			}
			System.out.println("Mage added successfully!");
			
			String playerID = String.format("M%03d", idCounter++);
			Mage mage = new Mage(playerID, name, type, health, baseDamage, magicType, magicDamage);
			playerList.add(mage);

		}

	}
	
//	public boolean Alphabetic(String name) {
//		for (int i = 0; i < name.length(); i++) {
//			char c = name.charAt(i);
//				// huruf capital			 // huruf kecil
//			if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {	
//				return false;
//			}
//		}
//		return true;
//	}	

//	Random rand = new Random();
//	int number = rand.nextInt(999) + 1;
//	String id = "BI" + number;

//	private boolean checkAlphanum(String alnum) {
//		boolean huruf = false;
//		boolean angka = false;
//		for (int i = 0; i < alnum.length(); i++) {
//			char c = alnum.charAt(i);
//			if ((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
//				huruf = true;
//			} else if (c >= '0' && c <= '9') {
//				angka = true;
//			} else {
//				return false;
//			}
//		}
//		return huruf && angka;
//	}

	public Main() {
		Menu();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
