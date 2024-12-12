/*
 *	Author:  Erin Oh
 *  Date: 2024 Sep 17
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which option will you choose?.");
		System.out.println("Option 1");
		System.out.println("Option 2");
		
		int answer1 = sc.nextInt();
		
		if(answer1 == 1){
			System.out.println("You chose option 1!");
		}
		else if(answer1 == 2){
			System.out.println("You chose option 2!");
		}
	}
}
