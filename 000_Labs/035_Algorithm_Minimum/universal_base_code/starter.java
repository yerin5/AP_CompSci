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
		//BaseClass test = new BaseClass();
		
		int x = (int)((Math.random()*150)+51);
		int[] randInt = new int [x];
		
		System.out.println("how many element: " + x);
		System.out.println();
		
		for(int i=0; i<randInt.length; i++){
			randInt[i] = (int)((Math.random()*100)+1);
		}
		
		for(int i=0;i<randInt.length;i++){
		System.out.print(randInt[i] + ", ");
		}
	
	int min = Integer.MAX_VALUE;
	for(int i=0; i<randInt.length; i++){
		if(randInt[i]<min){
			min = randInt[i];
		}
	}
	
		int max = Integer.MIN_VALUE;
	for(int i=0; i<randInt.length; i++){
		if(randInt[i]>max){
			max = randInt[i];
		}
	}
	
	int sum = 0;
	double ave = 0;
	for(int i=0; i<randInt.length; i++){
		sum += randInt[i];
	}
	ave = sum/(double)randInt.length;
	
	System.out.println();
	System.out.println();
    System.out.println("min: " + min);
    System.out.println();
    System.out.println("max: " + max);
    System.out.println();
    System.out.println("average: " + ave);
    //System.out.println();
    //System.out.println(sum);
	}
}
