/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("------------------------------------------------------");
		
		int start = 100;
		
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
		
		String yes = sc.nextLine();
		
		if(((yes.equals("Yes"))) || (yes.equals("yes")) || (yes.equals("Y")) || (yes.equals("y"))){
		}
		else{
			System.out.println("error :(");
		}
		
		System.out.print("You have $100. How much would you like to wager? ");
		int money = sc.nextInt();
		
		System.out.println("Great! Let's Play!");
		System.out.println("Your rolls are: ");
		System.out.println("_________________");
		
		System.out.print("  | " + ((int)(Math.random()*10)+0) + " | ");
		int a = sc.nextInt();
		
		System.out.print(((int)(Math.random()*10)+0) + " | ");
		int b = sc.nextInt();
		
		System.out.println(((int)(Math.random()*10)+0) + " | ");
		int c = sc.nextInt();
		
		System.out.println("_________________");
		
		
		if((a == b) && (b == c) && (a == c)){
			System.out.println("You won! You're wager has now been tripled!");
			System.out.println("You now have " + (start + (money*3)));
		}
		else if(((a == b) || (b == c) || (a == c))){
			System.out.println("You won! You're wager has now been doubled!");
			System.out.println("You now have " + (start + (money*2)));
		}
		else{
			System.out.println("Didn't win this time, better luck next time!");
			System.out.println("You now have " + (start-money));
			break;
		}
		System.out.print("You have $" + start + ". How much would you like to wager? ");
		int money = sc.nextInt();
	}
}