/*
 *	Author:Erin Oh
 *  Date:2024 Sep 11
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number:");
	int yy = sc.nextInt();
	
	System.out.println("Here are the next 5 numbers!");
	System.out.println((yy+1) + "," + (yy+2) + "," + (yy+3) + "," + (yy+4) + "," + (yy+5));
	
	System.out.println("Here are the next 5 multiples of " + yy);
	System.out.println((yy*1) + "," + (yy*2) + "," + (yy*3) + "," + (yy*4) + "," + (yy*5));
	
	System.out.println("Here is " + yy + " divided by 100!");
	System.out.println((yy/100.00));
	
	System.out.println("Here is " + yy + " divided by 10!");
	System.out.println((yy/10.00));
	
	}
}
