import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		public class my Character{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public myCharacter(){
		role = "role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public myCharacter(String a, int b, int c, int d, int e){
		role = a;
		strength = b;
		dexterity = c;
		intelligence = 0;
		charisma = 0;
	}
	
	public Sting setRole(String a){
		if(a != "Warrior" || a != "Wizard" || a != "Rogue"){
			a = "no role";
		}
		role = a;
		return role;
		}
		
	public int setStrength(int b){
		if(b<0){
			b = 0;
		}
		strength = a;
		return strength;
	}
	
	public int setDexterity(int c){
		if(c<0){
			c = 0;
		}
		dexterity = c;
		return dexterity;
	}
	
	public int setIntelligence(int d){
		if (d<0){
			d = 0;
		}
		intelligence = d;
		return intelligence;
	}
	
	public int setCharisma(int e){
		if(e<0){
			e = 0;
		}
		charisma = e;
		return charisma;
		}
	
	public boolean setAll(String a, int b, int c, int d, int e){
		boolean aa = (a.equals("warrior") || a.equals("wizard") || a.equals("rogue"));
		boolean bb = b > 0;
		boolean cc = c > 0;
		boolean dd = d > 0;
		boolean ee = e > 0;
	}	
	}
	
	}
		}
	
	public void myCharacterStats(){
		System.out.println("Role: " + role + "! How something!");
		System.out.println("Your strength is " + strength);
		System.out.println("your dexterity is " + dexterity);
		System.out.println("your intelligence is " + intelligence);
		System.out.println("Your charisma is " + charisma);
	}
