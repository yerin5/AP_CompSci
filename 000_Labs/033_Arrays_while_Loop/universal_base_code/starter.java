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
		
		int [] randInt = new int [1000];
		
		for(int i=0; i<randInt.length; i++){
			randInt[i] = (int)(Math.random()*1000);
		}
		int j = 0;
		while(j<1000){
			System.out.print(randInt[j] + ", ");
			j++;
		}
	}
}
