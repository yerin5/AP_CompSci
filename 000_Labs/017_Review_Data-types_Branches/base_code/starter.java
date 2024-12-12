/*
 *	Author:  Erin Oh
 *  Date: 2024 Sept 24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your character name!"); 
		String name = sc.nextLine();
		System.out.println("Your character name is " + name + "!");
		
		System.out.println("Input your character's title! (ex. Slayer of Dragons)");
		String title = sc.nextLine();
		System.out.println("Your character's title is " + title + "!");
		
		System.out.println("Choose your role!"); 
		System.out.println("1. Wizard");
		System.out.println("2. Warrior");
		System.out.println("3. Rogue");
		
		String a = sc.nextLine();
		
		if((a.equals("wizard")) || (a.equals("Wizard"))){
			System.out.println("Your role is the Wizard!");
		}
		else if((a.equals("warrior")) || (a.equals("Warrior"))){
			System.out.println("Your role is the Warrior");
		}
		else if((a.equals("rogue")) || (a.equals("Rouge"))){
			System.out.println("Your role is the Rogue");
		}
		else{
			System.out.println("Please input correctly");
		}
		
		System.out.println("You have 20 skill points to spend! Choose from Strength, Dexterity, Intelligence, and Charisma");
		int points = 20;
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		System.out.println("You have " + (points - strength) + " points left.");
		
		System.out.print("Dexterity (1-10):");
		int dexterity = sc.nextInt();
		System.out.println("You have " + (points - strength - dexterity) + " points left.");
		
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		System.out.println("You have " + (points - strength - dexterity - intelligence) + " points left.");
		
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		System.out.println("You have " + (points - strength - dexterity - intelligence - charisma) + " points left.");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("You are " + name + ", " + title + "!");
		System.out.println("You are a " + a + " with the following stats:");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println("   ");
		System.out.println("Good luck on your quest " + name + "!");
	}
}
