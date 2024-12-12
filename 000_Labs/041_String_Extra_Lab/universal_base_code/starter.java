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
		
		System.out.println("Please enter your sentence to reverse: ");
		String sentence = sc.nextLine();
		
		int position = sentence.indexOf(" ");
		String reverse = "";
		
		int index = 0;
		
		while(position>0){
			reverse = sentence.substring(index, position)+ " " + reverse;
			index = position + 1;
			position = sentence.indexOf(" ", position+1);
			
			if(position == -1){
				reverse = sentence.substring(index, sentence.length()) + " " + reverse;
			}
		}
		
		System.out.println(reverse);
		

	}
}
