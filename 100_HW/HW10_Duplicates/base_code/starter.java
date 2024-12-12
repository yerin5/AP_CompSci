/*
 *	Author:Erin Oh
 *  Date:2024 Nov 10
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		 int [] randInt = new int [20]; // create an array of 20 elements
		 
		 for(int i=0; i<randInt.length; i++){
		 	randInt[i] = (int)((Math.random()*10)+1); // assign random value between 1 and 10
		 	System.out.print(randInt[i] + ", ");
		 }
		 
		 System.out.println();
		 
		 int targetNum = (int)((Math.random()*10)+1);
		 System.out.println("Target number: " + targetNum); // target number created
		 
		 int duplicate = 0;
		 for(int i=0; i<randInt.length; i++){
		 	if(targetNum==randInt[i]){
		 		System.out.println("randInt[" + i + "]"); //duplicates
		 		duplicate++;
		 	}
		 }
		 System.out.println("# of duplicate: " + duplicate);
		 
		 for(int i=1; i<randInt.length; i++){
		 	if(randInt[i-1] == randInt[i]){
		 		System.out.println("consecutive number: " + randInt[i] + "; randInt[" + (i-1) + "] & randInt[" + i + "]"); //consecutive numbers
		 	}
		 }
	}
}
