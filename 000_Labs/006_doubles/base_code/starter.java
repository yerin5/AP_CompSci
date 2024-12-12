/*
 *	Author:  Erin Oh
 *  Date: 2024 Sep 11
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit:"); 
		int xx = sc.nextInt();
		
		System.out.print("Here is the temperature in celsius: " + ((xx-32.00)*(5.00/9.00)));
	}
}
