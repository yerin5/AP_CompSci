/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		myCharacter role = new myCharacter();
		
		System.out.println("Role: " + noRole.getRole());
		System.out.println("Strength: 0");
		System.out.println("Dexterity: 0");
		System.out.println("Intelligence: 0");
		System.out.println("Charisma: 0");
		
		System.out.println("What would you like to be? ");
		String a = sc.nextLine();
		
		myCharacter role = new myCharacter(a);
		
		System.out.println("Your role is: " + a.getRole());
		
}
}
