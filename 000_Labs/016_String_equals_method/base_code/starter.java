/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
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
	}
}
