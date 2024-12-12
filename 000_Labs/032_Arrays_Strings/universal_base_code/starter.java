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
		
		String [] song = new String [10];
		song[0] = "I'll imagine we fell in love";
		song[1] = "I'll nap under moonlight skies with you";
		song[2] = "I think I'll picture us, you with the waves";
		song[3] = "The ocean's colors on your face";
		song[4] = "I'll leave my heart with your air";
		song[5] = "So let me fly with you";
		song[6] = "Will you be forever with me?";
		song[7] = "My love will always stay by you";
		song[8] = "I'll keep it safe, so don't you worry a thing, I'll tell you I love you more";
		song[9] = "It's stuck with you forever, so promise you won't let it go";
		
		for(int i = 0; i<song.length; i++){
			System.out.println(song[i]);
		}
	}
}
