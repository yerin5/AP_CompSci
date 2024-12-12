/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your name: ");
		String name = sc.nextLine();
		
		System.out.println("Choose the number of times your name should output: ");
		int a = sc.nextInt();
		
		int count = 0;
		
		while(count < a){
			System.out.println(name);
			count = count + 1;
		}
		
	}
}
