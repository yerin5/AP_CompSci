/*
 *	Author:  Erin Oh
 *  Date: 2024 Sep 19
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a variable:");
		int a = sc.nextInt();
		
		System.out.println("Input another variable");
		int b = sc.nextInt();
		
		System.out.println(a-b);
		int answer1 = sc.nextInt();
		
		if(answer1 == 0){
            System.out.println("It is equal!");
        }    
        else if(answer1 != 0){
            System.out.println("It is different!!");
        }    
	}
}
