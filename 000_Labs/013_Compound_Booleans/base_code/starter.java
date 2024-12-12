/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the first integer");
		int a = sc.nextInt();
		
		System.out.println("Input the second integer");
		int b = sc.nextInt();
		
		System.out.println("Input the third integet");
		int c = sc.nextInt();
		
		if((a > b) && (a > c)){
			System.out.println(a + " is the biggest integer!");
		}
		else if((b > a) && (b > c)){
			System.out.println(b + " is the biggest integer!");
		}
		else if((c > a) && (c > b)){
			System.out.println(c + " is the biggest integer");
		}
		else
		System.out.println("you did it wrong. get it right.");
		}
		}
