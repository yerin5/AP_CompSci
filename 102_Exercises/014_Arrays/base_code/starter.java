/*
 *	Author: Erin Oh
 *  Date: 2024 Nov 05
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int [1001];
		 int i = 0;
		 int x = 3;
		 while (i < arr.length){
		 	System.out.println(arr[i] = x);
		 	i++
		 }
		System.out.println("------------------");
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (i+1)*3;
			System.out.println("Indes: " + i + "Value: ");
			
		}
		
		System.out.println("------------------");

		int [] arr = new int [1000];
		int i = 0;
		int x = 1000;
		while(i<1001){
			System.out.println(arr[i] = x);
			x = x-1;
			i++;
		}
	}
}
