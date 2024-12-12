/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	System.out.println(pow(2,3));

		
	}
	public static double pow(double x, int y) {
        double result = 1.0;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
