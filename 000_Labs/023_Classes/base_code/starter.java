/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		String character = ("Wizard", 5, 5, 5, 5);
		
		System.out.println("Role: " + character.Role());
        System.out.println("Strength: " + character.Strength());
        System.out.println("Dexterity: " + character.Dexterity());
        System.out.println("Intelligence: " + character.Intelligence());
        System.out.println("Charisma: " + character.Charisma());
    }
}
	
	public class Character{
		
		public Character(String role, int strength, int dexterity, int intelligence, int charisma) {
        String role = role;
        int strength = strength;
        int dexterity = dexterity;
        int intelligence = intelligence;
        int charisma = charisma;
        
    public String Role() {
        return role;
    }

    public int Strength() {
        return strength;
    }

    public int Dexterity() {
        return dexterity;
    }

    public int Intelligence() {
        return intelligence;
    }

    public int Charisma() {
        return charisma;
    }
}
}
