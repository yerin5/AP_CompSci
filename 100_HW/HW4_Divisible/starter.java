/*
 *	Author:Erin Oh
 *  Date:2024 Sept 29
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a variable: ");
		int a = sc.nextInt();
		
		System.out.print("Input another variable: ");
		int b = sc.nextInt();
		
		if((a%2)==0){
			System.out.println("Your first variable is an even number");
		}
		else{
			System.out.println("Your first variable is an odd number");
		}	
		if((b%2)==0){
			System.out.println("Your second variable is an even number");
		}
		else{
			System.out.println("Your second variable is an odd number");
		}
		
		if((a%2)==0){
			System.out.println(a + " is divisable by 2!");
		}
		else{
			System.out.println(a + " is not divisable by 2.");
		}
		
		if((a%3)==0){
			System.out.println(a + " is divisable by 3!");
		}
		else{
			System.out.println(a + " is not divisable by 3.");
		}
		
		if((a%5)==0){
			System.out.println(a + " is divisable by 5!");
		}
		else{
			System.out.println(a + " is not divisable by 5.");
		}
		
		
			if((b%2)==0){
			System.out.println(b + " is divisable by 2!");
		}
		else{
			System.out.println(b + " is not divisable by 2.");
		}
		
		if((b%3)==0){
			System.out.println(b + " is divisable by 3!");
		}
		else{
			System.out.println(b + " is not divisable by 3.");
		}
		
		if((b%5)==0){
			System.out.println(b + " is divisable by 5!");
		}
		else{
			System.out.println(b + " is not divisable by 5.");
		}
	}
}
