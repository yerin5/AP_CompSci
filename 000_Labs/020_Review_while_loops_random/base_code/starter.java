/*
 *	Author:  Erin Oh
 *  Date: 2024 Oct 1
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Let's play guess the number! I'm thinking of a number between 1 and 1000!");
		
		int a = ((int)(Math.random()*999)+1);
		
		System.out.print("Input your guess: ");
		int b = sc.nextInt();
		
		while(true){
			if(a == b){
				System.out.println("You got it correct!");
				break;
			}
			else if(a>b){
				System.out.println("Your guess is a bit low");
			}
			else if(a<b){
				System.out.println("Your guess is a bit high");
			}
			else{
				System.out.println(" error D: ");
			}
			System.out.print("Input your guess: ");
			b = sc.nextInt();
			
		}
	}
}
