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

		int [] randomInt = new int [1000];
		for(int i=0; i<randomInt.length; i++){
			randomInt[i] = (int)(Math.random()*1000);
			System.out.print(randomInt[i] + ", ");
		}

		
	}
}
