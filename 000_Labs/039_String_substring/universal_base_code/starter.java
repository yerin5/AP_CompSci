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
		
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		
		System.out.println("Your word is: " + word);
		
		
		int wordlength = word.length();
		
		System.out.println("Your word is " + wordlength + " letters long");
		
		for(int i = 0; i<wordlength; i++){
			System.out.println(i + " " + word.substring(i, (i+1)));
		}
	}
}
