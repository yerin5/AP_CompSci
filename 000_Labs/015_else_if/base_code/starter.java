/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Let's play guess the number! I'm thinking of a number between 1 and 1000!");
		
		int a = ((int)(Math.random()*999)+1);
		
		System.out.println("Input your guess!");
		int b = sc.nextInt();
		
		if(a == b){
			System.out.println("The integer was " + a + "!");
		}
		else if(a > b){
			System.out.println("Guess a higher number");
		}
		else if(a < b){
			System.out.println("Guess a lower number");
		}
		else{
			System.out.println("get out.");
		}
	}
}
