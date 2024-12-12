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

	int [] randInt = new int [100];
	
	for(int i=0; i<randInt.length; i++){
		randInt[i] = (int)((Math.random()*100)+1);
	}
	
	myMath t1 = new myMath();
	t1.toStringArray(randInt);
	
	int average;
	average = t1.getArrayAverage(randInt);
	System.out.println();
	System.out.println("average: " + average);
	
	int maximum;
	maximum = t1.getArrayMax(randInt);
	System.out.println();
	System.out.println("maximum: " + maximum);
	
	int minimum;
	minimum = t1.getArrayMin(randInt);
	System.out.println();
	System.out.println("minimum: " + minimum);
	}
}


class myMath{
	void toStringArray(int[] x){
		for(int i=0; i<x.length; i++){
			System.out.print(x[i] + " ");
		}
	}
	
	int getArrayAverage(int[] x){
		int sum = 0;
		int avr = 0;
		for(int i=0; i<x.length; i++){
			sum = sum + x[i];
		}
		avr = sum/x.length;
		return avr;
	}
	
	int getArrayMax(int[] x){
		int max = x[0];
		for(int i=1; i<x.length-1; i++){
			if(max < x[i]){
				max = x[i];
			}
			}
			return max;
		}

	int getArrayMin(int[] x){
		int min = x[0];
		for(int i=1; i<x.length-1; i++){
			if(min > x[i]){
				min = x[i];
			}
			}
			return min;
		}		
	}