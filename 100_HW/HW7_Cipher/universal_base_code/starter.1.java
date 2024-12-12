/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message to encode/decode");
		String message = sc.nextLine();
		System.out.println("Enter an int for the key");
		int key = sc.nextInt();
		
		System.out.println("Encode/decode (1)");
		
		System.out.println(Cipher.encode(message));
		
		System.out.println("Encode/decode (2)");
		
		System.out.println(Cipher.keyedEncode(message, key));
		
		System.out.println("decipher (last 2)");
		key = 0;
		while (key<37){
			key++;
			System.out.print("Key " + key + " = ");
			System.out.println(Cipher.keyedEncode(message, key));
		}
	}
}
