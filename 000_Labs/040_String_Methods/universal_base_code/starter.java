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
		BaseClass test = new BaseClass();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String name = sc.nextLine();
		
		System.out.println("Your full name is: " + name);
		
		int i = name.indexOf(" ");
		System.out.println("Your last name is: " + name.substring(i+1));
		

	}
}
