/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?"); 
		String name = sc.nextLine();
		System.out.println("My first name is " + name + ".");
		
		System.out.println("How old are you?");
		String age = sc.nextLine();
		System.out.println("I am " + age + " years old.");
		
		System.out.println("Which month is your birthday in?");
		String month = sc.nextLine();
		System.out.println("My birthday is in " + month + ".");
		
		System.out.println("Which day?");
		String day = sc.nextLine();
		System.out.println("My birthday is on the " + day + ".");
		
		System.out.println("Which year were you born?");
		String year = sc.nextLine();
		System.out.println("I was born in " + year + ".");
		
		System.out.println("How much is a buck fifty?");
		String buck = sc.nextLine();
		System.out.println("A buck fifty is " + buck + ".");
	}
}
