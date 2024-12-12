/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the day:");
		System.out.println("0. Sunday");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Satday");
		
		int answer1 = sc.nextInt();
		
		if(answer1 == 0){
			System.out.println("Your alarm will sound at 10:00 AM");
		}
		if(answer1 == 1){
			System.out.println("Your alarm will sound at 7:00 AM");
		}
		if(answer1 == 2){
			System.out.println("Your alarm will sound at 7:00 AM");
		}
		if(answer1 == 3){
			System.out.println("Your alarm will sound at 7:00 AM");
		}
		if(answer1 == 4){
			System.out.println("Your alarm will sound at 7:00 AM");
		}
		if(answer1 == 5){
			System.out.println("Your alarm will sound at 7:00 AM");
		}
		if(answer1 == 6){
			System.out.println("Your alarm will sound at 10:00 AM");
		}
		}
	}
