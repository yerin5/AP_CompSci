import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of magic squares you would like to see: ");
		int num = sc.nextInt();
		
		System.out.println("Your amount is " + num);
		

		CVMath.specialSquare(num);
		//System.out.println(CVMath.findMid(2,3,1));
	}
		
}
